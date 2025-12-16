package com.avito.android.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.browser.customtabs.h;
import com.avito.android.R;
import com.avito.android.deep_linking.links.Store;
import com.avito.android.remote.model.Coordinates;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ImplicitIntentFactoryImpl.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/n2;", "Lcom/avito/android/util/m2;", "_avito_intent-factories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.n2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35853n2 implements InterfaceC35845m2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f318929a;

    @Inject
    public C35853n2(@Y61.k Context context) {
        this.f318929a = context.getApplicationContext();
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent a() {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        Context context = this.f318929a;
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        return intent;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent b(@Y61.k Store store) {
        PackageManager packageManager = this.f318929a.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.avito.android"));
        intent.setPackage(store.f133683b);
        return packageManager.queryIntentActivities(intent, 0).isEmpty() ? new Intent("android.intent.action.VIEW", Uri.parse(store.f133684c)) : intent;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent c(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        Intent data = new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:"));
        if (str != null) {
            data.putExtra("android.intent.extra.EMAIL", new String[]{str});
        }
        if (str2 != null) {
            data.putExtra("android.intent.extra.SUBJECT", str2);
        }
        data.putExtra("android.intent.extra.TEXT", str3);
        return Intent.createChooser(data, null);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent d(@Y61.k String str, @Y61.k String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        return intent;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent e() {
        Intent intentO = o();
        intentO.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        return intentO;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent f(@Y61.l String str, @Y61.k String str2) {
        if (str != null) {
            str2 = androidx.compose.foundation.H.i('\n', str, str2);
        }
        return new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str2);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent g(@Y61.k String str) {
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        Context context = this.f318929a;
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", str);
        return context.getPackageManager().resolveActivity(intent, 0) != null ? intent : a();
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent h() {
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        StringBuilder sb2 = new StringBuilder("package:");
        Context context = this.f318929a;
        sb2.append(context.getPackageName());
        intent.setData(Uri.parse(sb2.toString()));
        intent.addFlags(268435456);
        return context.getPackageManager().resolveActivity(intent, 0) != null ? intent : i();
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent i() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + this.f318929a.getPackageName()));
        return intent.addFlags(268435456);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent j(@Y61.k Uri uri) {
        return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent k(@Y61.k Coordinates coordinates) {
        return new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + coordinates.getLatitude() + ',' + coordinates.getLongitude()));
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent l() {
        return new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("video/*").setFlags(1).setFlags(64);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent m(@Y61.k Uri uri, @Y61.l String str) {
        return new Intent("android.intent.action.VIEW").setDataAndType(uri, str).addFlags(1);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final ArrayList n(@Y61.k Uri uri) {
        List<ResolveInfo> listQueryIntentActivities = this.f318929a.getPackageManager().queryIntentActivities(t(Uri.parse("https://fake.avito.ru")), 0);
        ArrayList arrayList = new ArrayList(C42745f0.q(listQueryIntentActivities, 10));
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Intent("android.intent.action.VIEW", uri).setPackage((String) it2.next()));
        }
        return arrayList2;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent o() {
        return new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("image/*").setFlags(1).setFlags(64);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent p(@Y61.k Uri uri, @Y61.l String str, @Y61.k String str2) {
        if (str != null) {
            str2 = androidx.compose.foundation.H.i('\n', str, str2);
        }
        return new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", uri).putExtra("android.intent.extra.TEXT", str2);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.l
    public final Intent q(@Y61.k Uri uri, @Y61.l Uri uri2) {
        PackageManager packageManager = this.f318929a.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
            return uri2 != null ? new Intent("android.intent.action.VIEW", uri2) : null;
        }
        return intent;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent r() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        return Intent.createChooser(intent, null);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent s(@Y61.k String[] strArr) {
        return new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("*/*").putExtra("android.intent.extra.MIME_TYPES", strArr).setFlags(1).setFlags(64);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent t(@Y61.k Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent u(@Y61.k Uri uri, boolean z12, boolean z13) {
        String str;
        h.i iVar = new h.i();
        Context context = this.f318929a;
        iVar.f22867b.f22826a = Integer.valueOf(androidx.core.content.d.getColor(context, R.color.legacy_white) | (-16777216));
        iVar.b(true);
        if (z12) {
            iVar.f22870e = 1;
            iVar.f22866a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        }
        Intent intent = iVar.a().f22864a;
        if (z13) {
            PackageManager packageManager = context.getPackageManager();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                ResolveInfo next = it.next();
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(next.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    str = next.activityInfo.packageName;
                    break;
                }
            }
            if (str != null) {
                intent.setPackage(str);
            }
        }
        return intent.setData(uri);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final PendingIntent v(@Y61.k Class<?> cls) {
        Context context = this.f318929a;
        return PendingIntent.getBroadcast(context, 123, new Intent(context, cls), 167772160);
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent w(@Y61.k String[] strArr) {
        Intent intentS = s(strArr);
        intentS.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        return intentS;
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent x(@Y61.k String str, @Y61.k Intent intent, @Y61.k ArrayList arrayList) {
        return Intent.createChooser(intent, str).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
    }

    @Override // com.avito.android.util.InterfaceC35845m2
    @Y61.k
    public final Intent y(@Y61.k String str, @Y61.k String str2) {
        return u(Uri.parse(str.concat(str2)), (6 & 2) == 0, (6 & 4) == 0);
    }
}
