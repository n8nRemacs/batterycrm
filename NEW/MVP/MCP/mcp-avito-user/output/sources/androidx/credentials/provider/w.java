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
import androidx.credentials.provider.l;
import com.avito.android.R;
import com.google.android.gms.common.internal.AbstractC36699e;
import j.X;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PasswordCredentialEntry.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016BU\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/credentials/provider/w;", "Landroidx/credentials/provider/q;", "Landroid/content/Context;", "context", "", "username", "Landroid/app/PendingIntent;", AbstractC36699e.KEY_PENDING_INTENT, "Landroidx/credentials/provider/l;", "beginGetPasswordOption", "displayName", "Ljava/time/Instant;", "lastUsedTime", "Landroid/graphics/drawable/Icon;", "icon", "", "isAutoSelectAllowed", "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/l;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "a", "b", "c", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final d f45318q = new d(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45319g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final CharSequence f45320h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45321i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final PendingIntent f45322j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Instant f45323k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Icon f45324l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f45325m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f45326n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f45327o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f45328p;

    /* compiled from: PasswordCredentialEntry.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/w$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @SuppressLint({"WrongConstant"})
        @X41.n
        @Y61.l
        @RestrictTo
        public static final w a(@Y61.k Slice slice) {
            Set setP0;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            CharSequence text = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
            CharSequence text4 = null;
            PendingIntent action = null;
            Instant instantOfEpochMilli = null;
            Icon icon = null;
            CharSequence text5 = null;
            CharSequence text6 = null;
            for (SliceItem sliceItem : slice.getItems()) {
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
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                    if (L.f(sliceItem.getText(), "true")) {
                        z12 = true;
                    }
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                    z14 = true;
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                    text6 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                    text5 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                    if (L.f(sliceItem.getText(), "true")) {
                        z13 = true;
                    }
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                    z15 = true;
                }
            }
            try {
                l.a aVar = l.f45265f;
                Bundle bundle = new Bundle();
                String string = text.toString();
                aVar.getClass();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                if (stringArrayList == null || (setP0 = C42745f0.P0(stringArrayList)) == null) {
                    setP0 = B0.f406639b;
                }
                return new w(text2, text3, text4, action, instantOfEpochMilli, icon, z12, new l(setP0, bundle, string), z13, text5, text6, z14, true, z15);
            } catch (Exception e12) {
                e12.getMessage();
                return null;
            }
        }

        @X41.n
        @Y61.k
        @RestrictTo
        public static final Slice b(@Y61.k w wVar) {
            String str = wVar.f45325m ? "true" : "false";
            String str2 = wVar.f45283d ? "true" : "false";
            Slice.Builder builderAddText = new Slice.Builder(Uri.EMPTY, new SliceSpec(wVar.f45280a, 1)).addText(wVar.f45321i, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(wVar.f45319g, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(wVar.f45320h, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(str, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(wVar.f45281b.f45256a, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID"));
            List<String> listSingletonList = Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON");
            Icon icon = wVar.f45324l;
            Slice.Builder builderAddText2 = builderAddText.addIcon(icon, null, listSingletonList).addText(wVar.f45282c, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")).addText(wVar.f45284e, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")).addText(str2, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
            try {
                boolean z12 = false;
                if (Build.VERSION.SDK_INT >= 28) {
                    if (wVar.f45326n) {
                        z12 = wVar.f45327o;
                    } else if (icon.getType() == 2 && icon.getResId() == R.drawable.ic_password) {
                        z12 = true;
                    }
                }
                if (z12) {
                    builderAddText2.addInt(1, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                }
            } catch (IllegalStateException unused) {
            }
            if (wVar.f45328p) {
                builderAddText2.addInt(1, null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
            }
            Instant instant = wVar.f45323k;
            if (instant != null) {
                builderAddText2.addLong(instant.toEpochMilli(), null, Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            builderAddText2.addAction(wVar.f45322j, new Slice.Builder(builderAddText2).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            return builderAddText2.build();
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/w$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class b {
        static {
            new b();
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/w$c;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/credentials/provider/w$d;", "", "<init>", "()V", "", "FALSE_STRING", "Ljava/lang/String;", "", "REVISION_ID", "I", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_ICON", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_OPTION_ID", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "SLICE_HINT_TYPE_DISPLAY_NAME", "TAG", "TRUE_STRING", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Instant instant, Icon icon, boolean z12, l lVar, boolean z13, CharSequence charSequence4, CharSequence charSequence5, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
        boolean z17;
        CharSequence charSequence6 = (i12 & 512) != 0 ? charSequence : charSequence4;
        CharSequence charSequence7 = (i12 & 1024) != 0 ? null : charSequence5;
        if ((i12 & 2048) != 0) {
            AbstractC22874x.a aVar = AbstractC22874x.f45331g;
            Bundle bundle = lVar.f45258c;
            aVar.getClass();
            z17 = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        } else {
            z17 = z14;
        }
        this(charSequence, charSequence2, charSequence3, pendingIntent, instant, icon, z12, lVar, z13, charSequence6, charSequence7, z17, (i12 & 4096) != 0 ? false : z15, (i12 & 8192) != 0 ? false : z16);
    }

    public w(@Y61.k CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.k CharSequence charSequence3, @Y61.k PendingIntent pendingIntent, @Y61.l Instant instant, @Y61.k Icon icon, boolean z12, @Y61.k l lVar, boolean z13, @Y61.l CharSequence charSequence4, @Y61.l CharSequence charSequence5, boolean z14, boolean z15, boolean z16) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", lVar, charSequence4 == null ? charSequence : charSequence4, z13, charSequence5);
        this.f45319g = charSequence;
        this.f45320h = charSequence2;
        this.f45321i = charSequence3;
        this.f45322j = pendingIntent;
        this.f45323k = instant;
        this.f45324l = icon;
        this.f45325m = z12;
        this.f45326n = z15;
        this.f45327o = z16;
        this.f45328p = z14;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
    }

    public w(Context context, CharSequence charSequence, PendingIntent pendingIntent, l lVar, CharSequence charSequence2, Instant instant, Icon icon, boolean z12, CharSequence charSequence3, boolean z13, int i12, C42822w c42822w) {
        this(charSequence, (i12 & 16) != 0 ? null : charSequence2, context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL), pendingIntent, (i12 & 32) != 0 ? null : instant, (i12 & 64) != 0 ? Icon.createWithResource(context, R.drawable.ic_password) : icon, (i12 & 128) != 0 ? false : z12, lVar, (i12 & 512) != 0 ? false : z13, null, (i12 & 256) != 0 ? null : charSequence3, false, false, false, 14848, null);
    }

    public /* synthetic */ w(Context context, CharSequence charSequence, PendingIntent pendingIntent, l lVar, CharSequence charSequence2, Instant instant, Icon icon, boolean z12, int i12, C42822w c42822w) {
        this(context, charSequence, pendingIntent, lVar, (i12 & 16) != 0 ? null : charSequence2, (i12 & 32) != 0 ? null : instant, (i12 & 64) != 0 ? Icon.createWithResource(context, R.drawable.ic_password) : icon, (i12 & 128) != 0 ? false : z12);
    }

    @InterfaceC42830m
    public /* synthetic */ w(Context context, CharSequence charSequence, PendingIntent pendingIntent, l lVar, CharSequence charSequence2, Instant instant, Icon icon, boolean z12) {
        this(charSequence, charSequence2, context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL), pendingIntent, instant, icon, z12, lVar, false, null, null, false, false, false, 15872, null);
    }
}
