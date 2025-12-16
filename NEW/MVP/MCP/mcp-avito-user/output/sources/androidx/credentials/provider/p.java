package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import j.X;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: CreateEntry.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/credentials/provider/p;", "", "a", "b", "c", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final d f45271h = new d(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f45272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PendingIntent f45273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Icon f45274c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CharSequence f45275d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Instant f45276e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Map<String, Integer> f45277f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45278g;

    /* compiled from: CreateEntry.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/p$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @X41.n
        @Y61.l
        public static final Bundle a(@Y61.k Map<String, Integer> map) {
            Bundle bundle = new Bundle();
            boolean z12 = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    bundle.putInt(entry.getKey(), entry.getValue().intValue());
                    z12 = true;
                }
            }
            if (z12) {
                return bundle;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
        @SuppressLint({"WrongConstant"})
        @X41.n
        @Y61.l
        @RestrictTo
        public static final p b(@Y61.k Slice slice) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMapC = linkedHashMap;
            CharSequence text = null;
            PendingIntent action = null;
            Icon icon = null;
            CharSequence text2 = null;
            Instant instantOfEpochMilli = null;
            boolean z12 = false;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME")) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON")) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION")) {
                    Bundle bundle = sliceItem.getBundle();
                    HashMap map = new HashMap();
                    if (bundle != null) {
                        for (String str : bundle.keySet()) {
                            try {
                                map.put(str, Integer.valueOf(bundle.getInt(str)));
                            } catch (Exception e12) {
                                e12.getMessage();
                            }
                        }
                    }
                    linkedHashMapC = v0.c(map);
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE")) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED") && L.f(sliceItem.getText(), "true")) {
                    z12 = true;
                }
            }
            try {
                return new p(text, action, icon, text2, instantOfEpochMilli, linkedHashMapC, z12);
            } catch (Exception e13) {
                e13.getMessage();
                return null;
            }
        }

        @X41.n
        @Y61.k
        @RestrictTo
        public static final Slice c(@Y61.k p pVar) {
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = pVar.f45278g ? "true" : "false";
            builder.addText(pVar.f45272a, null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME"));
            Instant instant = pVar.f45276e;
            if (instant != null) {
                builder.addLong(instant.toEpochMilli(), null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            CharSequence charSequence = pVar.f45275d;
            if (charSequence != null) {
                builder.addText(charSequence, null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE"));
            }
            Icon icon = pVar.f45274c;
            if (icon != null) {
                builder.addIcon(icon, null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON"));
            }
            Map<String, Integer> map = pVar.f45277f;
            if (a(map) != null) {
                builder.addBundle(a(map), null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION"));
            }
            builder.addAction(pVar.f45273b, new Slice.Builder(builder).addHints(Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")).build(), null).addText(str, null, Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED"));
            return builder.build();
        }
    }

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/p$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class b {
        static {
            new b();
        }
    }

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/p$c;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/credentials/provider/p$d;", "", "<init>", "()V", "", "AUTO_SELECT_FALSE_STRING", "Ljava/lang/String;", "AUTO_SELECT_TRUE_STRING", "", "DESCRIPTION_MAX_CHAR_LIMIT", "I", "REVISION_ID", "SLICE_HINT_ACCOUNT_NAME", "SLICE_HINT_AUTO_SELECT_ALLOWED", "SLICE_HINT_CREDENTIAL_COUNT_INFORMATION", "SLICE_HINT_ICON", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_NOTE", "SLICE_HINT_PENDING_INTENT", "SLICE_SPEC_TYPE", "TAG", "TYPE_TOTAL_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.l
        @RestrictTo
        public static p a(@Y61.k Slice slice) {
            if (Build.VERSION.SDK_INT >= 28) {
                return a.b(slice);
            }
            return null;
        }

        @X41.n
        @Y61.l
        @RestrictTo
        public static Slice b(@Y61.k p pVar) {
            if (Build.VERSION.SDK_INT >= 28) {
                return a.c(pVar);
            }
            return null;
        }

        public d() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z12, int i12, C42822w c42822w) {
        CharSequence charSequence3 = (i12 & 4) != 0 ? null : charSequence2;
        Instant instant2 = (i12 & 8) != 0 ? null : instant;
        this(charSequence, pendingIntent, (i12 & 16) != 0 ? null : icon, charSequence3, instant2, P0.j(new Q("android.credentials.TYPE_PASSWORD_CREDENTIAL", (i12 & 32) != 0 ? null : num), new Q("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", (i12 & 64) != 0 ? null : num2), new Q("TOTAL_CREDENTIAL_COUNT_TYPE", (i12 & 128) != 0 ? null : num3)), (i12 & 256) != 0 ? false : z12);
    }

    public p(@Y61.k CharSequence charSequence, @Y61.k PendingIntent pendingIntent, @Y61.l Icon icon, @Y61.l CharSequence charSequence2, @Y61.l Instant instant, @Y61.k Map<String, Integer> map, boolean z12) {
        this.f45272a = charSequence;
        this.f45273b = pendingIntent;
        this.f45274c = icon;
        this.f45275d = charSequence2;
        this.f45276e = instant;
        this.f45277f = map;
        this.f45278g = z12;
        if (charSequence.length() > 0) {
            if (charSequence2 != null && charSequence2.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            return;
        }
        throw new IllegalArgumentException("accountName must not be empty");
    }
}
