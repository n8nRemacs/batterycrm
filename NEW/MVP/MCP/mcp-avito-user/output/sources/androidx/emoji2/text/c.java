package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.util.z;
import androidx.emoji2.text.n;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: DefaultEmojiCompatConfig.java */
    @RestrictTo
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final b f46062a;

        @RestrictTo
        public a() {
            this.f46062a = Build.VERSION.SDK_INT >= 28 ? new d() : new C1784c();
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @RestrictTo
    public static class b {
        @P
        public ProviderInfo a(@N ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @N
        public Signature[] b(@N PackageManager packageManager, @N String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @N
        public List c(@N PackageManager packageManager, @N Intent intent) {
            return Collections.emptyList();
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @RestrictTo
    @X
    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static class C1784c extends b {
        @Override // androidx.emoji2.text.c.b
        @P
        public final ProviderInfo a(@N ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        @N
        public final List c(@N PackageManager packageManager, @N Intent intent) {
            return packageManager.queryIntentContentProviders(intent, 0);
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    @RestrictTo
    @X
    public static class d extends C1784c {
        @Override // androidx.emoji2.text.c.b
        @N
        public final Signature[] b(@N PackageManager packageManager, @N String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @P
    public static n a(@N Context context) {
        ProviderInfo providerInfoA;
        androidx.core.provider.h hVar;
        ApplicationInfo applicationInfo;
        a aVar = new a();
        PackageManager packageManager = context.getPackageManager();
        z.f(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        b bVar = aVar.f46062a;
        Iterator it = bVar.c(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoA = null;
                break;
            }
            providerInfoA = bVar.a((ResolveInfo) it.next());
            if (providerInfoA != null && (applicationInfo = providerInfoA.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoA == null) {
            hVar = null;
        } else {
            try {
                String str = providerInfoA.authority;
                String str2 = providerInfoA.packageName;
                Signature[] signatureArrB = bVar.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                hVar = new androidx.core.provider.h(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e12) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e12);
            }
        }
        if (hVar == null) {
            return null;
        }
        return new n(new n.c(context, hVar, n.f46135d));
    }
}
