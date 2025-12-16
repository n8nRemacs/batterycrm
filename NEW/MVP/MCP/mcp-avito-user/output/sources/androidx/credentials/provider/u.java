package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.credentials.AbstractC22874x;
import com.avito.android.R;
import com.google.android.gms.common.internal.AbstractC36699e;
import j.X;
import java.time.Instant;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: CustomCredentialEntry.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017Ba\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/credentials/provider/u;", "Landroidx/credentials/provider/q;", "Landroid/content/Context;", "context", "", "title", "Landroid/app/PendingIntent;", AbstractC36699e.KEY_PENDING_INTENT, "Landroidx/credentials/provider/h;", "beginGetCredentialOption", "subtitle", "typeDisplayName", "Ljava/time/Instant;", "lastUsedTime", "Landroid/graphics/drawable/Icon;", "icon", "", "isAutoSelectAllowed", "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/h;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "a", "b", "c", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class u extends q {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final d f45285r = new d(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f45286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45287h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final PendingIntent f45288i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f45289j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final CharSequence f45290k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final CharSequence f45291l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Icon f45292m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Instant f45293n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f45294o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f45295p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f45296q;

    /* compiled from: CustomCredentialEntry.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/u$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @SuppressLint({"WrongConstant"})
        @X41.n
        @Y61.l
        @RestrictTo
        public static final u a(@Y61.k Slice slice) {
            Iterator it;
            String type = slice.getSpec().getType();
            Iterator it2 = slice.getItems().iterator();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            CharSequence text = null;
            CharSequence text2 = null;
            PendingIntent action = null;
            CharSequence text3 = null;
            CharSequence text4 = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
            CharSequence text5 = null;
            CharSequence text6 = null;
            while (it2.hasNext()) {
                SliceItem sliceItem = (SliceItem) it2.next();
                if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                    text4 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                    text3 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else {
                    it = it2;
                    if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                        if (L.f(sliceItem.getText(), "true")) {
                            z12 = true;
                        }
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                        text5 = sliceItem.getText();
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                        z14 = true;
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                        if (L.f(sliceItem.getText(), "true")) {
                            z13 = true;
                        }
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                        z15 = true;
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                        text6 = sliceItem.getText();
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            try {
                return new u(type, text2, action, z12, text3, text4, icon, instantOfEpochMilli, new k(text.toString(), type, new Bundle()), z13, text5, text6, z14, true, z15);
            } catch (Exception e12) {
                e12.getMessage();
                return null;
            }
        }

        @X41.n
        @Y61.k
        @RestrictTo
        public static final Slice b(@Y61.k u uVar) {
            String str = uVar.f45289j ? "true" : "false";
            String str2 = uVar.f45283d ? "true" : "false";
            Slice.Builder builderAddText = new Slice.Builder(Uri.EMPTY, new SliceSpec(uVar.f45286g, 1)).addText(uVar.f45291l, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(uVar.f45287h, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(uVar.f45290k, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(str, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(uVar.f45281b.f45256a, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addText(uVar.f45282c, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")).addText(uVar.f45284e, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN"));
            List<String> listSingletonList = Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON");
            Icon icon = uVar.f45292m;
            Slice.Builder builderAddText2 = builderAddText.addIcon(icon, null, listSingletonList).addText(str2, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
            try {
                boolean z12 = false;
                if (Build.VERSION.SDK_INT >= 28) {
                    if (uVar.f45294o) {
                        z12 = uVar.f45295p;
                    } else if (icon.getType() == 2 && icon.getResId() == R.drawable.ic_other_sign_in) {
                        z12 = true;
                    }
                }
                if (z12) {
                    builderAddText2.addInt(1, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                }
            } catch (IllegalStateException unused) {
            }
            if (uVar.f45296q) {
                builderAddText2.addInt(1, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
            }
            Instant instant = uVar.f45293n;
            if (instant != null) {
                builderAddText2.addLong(instant.toEpochMilli(), null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            builderAddText2.addAction(uVar.f45288i, new Slice.Builder(builderAddText2).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            return builderAddText2.build();
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/u$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class b {
        static {
            new b();
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/u$c;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: CustomCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/credentials/provider/u$d;", "", "<init>", "()V", "", "FALSE_STRING", "Ljava/lang/String;", "", "REVISION_ID", "I", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_ICON", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_OPTION_ID", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "SLICE_HINT_TYPE_DISPLAY_NAME", "TAG", "TRUE_STRING", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z12, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, h hVar, boolean z13, CharSequence charSequence4, CharSequence charSequence5, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
        boolean z17;
        CharSequence charSequence6 = (i12 & 1024) != 0 ? charSequence : charSequence4;
        CharSequence charSequence7 = (i12 & 2048) != 0 ? null : charSequence5;
        if ((i12 & 4096) != 0) {
            AbstractC22874x.a aVar = AbstractC22874x.f45331g;
            Bundle bundle = hVar.f45258c;
            aVar.getClass();
            z17 = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        } else {
            z17 = z14;
        }
        this(str, charSequence, pendingIntent, z12, charSequence2, charSequence3, icon, instant, hVar, z13, charSequence6, charSequence7, z17, (i12 & 8192) != 0 ? false : z15, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z16);
    }

    @Override // androidx.credentials.provider.q
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF45280a() {
        return this.f45286g;
    }

    public u(@Y61.k String str, @Y61.k CharSequence charSequence, @Y61.k PendingIntent pendingIntent, boolean z12, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.k Icon icon, @Y61.l Instant instant, @Y61.k h hVar, boolean z13, @Y61.l CharSequence charSequence4, @Y61.l CharSequence charSequence5, boolean z14, boolean z15, boolean z16) {
        super(str, hVar, charSequence4 == null ? charSequence : charSequence4, z13, charSequence5);
        this.f45286g = str;
        this.f45287h = charSequence;
        this.f45288i = pendingIntent;
        this.f45289j = z12;
        this.f45290k = charSequence2;
        this.f45291l = charSequence3;
        this.f45292m = icon;
        this.f45293n = instant;
        this.f45294o = z15;
        this.f45295p = z16;
        this.f45296q = z14;
        if (str.length() > 0) {
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("title must not be empty");
            }
            return;
        }
        throw new IllegalArgumentException("type must not be empty");
    }

    public /* synthetic */ u(Context context, CharSequence charSequence, PendingIntent pendingIntent, h hVar, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z12, int i12, C42822w c42822w) {
        this(context, charSequence, pendingIntent, hVar, (i12 & 16) != 0 ? null : charSequence2, (i12 & 32) != 0 ? null : charSequence3, (i12 & 64) != 0 ? null : instant, (i12 & 128) != 0 ? Icon.createWithResource(context, R.drawable.ic_other_sign_in) : icon, (i12 & 256) != 0 ? false : z12);
    }

    @InterfaceC42830m
    public u(Context context, CharSequence charSequence, PendingIntent pendingIntent, h hVar, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z12) {
        this(hVar.f45257b, charSequence, pendingIntent, z12, charSequence2, charSequence3, icon, instant, hVar, false, null, null, false, false, false, 31744, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Context context, CharSequence charSequence, PendingIntent pendingIntent, h hVar, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z12, CharSequence charSequence4, boolean z13, int i12, C42822w c42822w) {
        h hVar2;
        CharSequence charSequence5;
        CharSequence charSequence6 = (i12 & 16) != 0 ? null : charSequence2;
        CharSequence charSequence7 = (i12 & 32) != 0 ? null : charSequence3;
        Instant instant2 = (i12 & 64) != 0 ? null : instant;
        Icon iconCreateWithResource = (i12 & 128) != 0 ? Icon.createWithResource(context, R.drawable.ic_other_sign_in) : icon;
        boolean z14 = (i12 & 256) != 0 ? false : z12;
        CharSequence charSequence8 = (i12 & 512) != 0 ? charSequence : charSequence4;
        boolean z15 = (i12 & 1024) != 0 ? false : z13;
        if (charSequence8.length() == 0) {
            charSequence5 = charSequence;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            charSequence5 = charSequence8;
        }
        this(hVar2.f45257b, charSequence, pendingIntent, z14, charSequence6, charSequence7, iconCreateWithResource, instant2, hVar, z15, charSequence5, null, false, false, false, 30720, null);
    }
}
