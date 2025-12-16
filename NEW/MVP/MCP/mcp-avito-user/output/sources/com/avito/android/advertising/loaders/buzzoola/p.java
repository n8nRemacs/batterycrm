package com.avito.android.advertising.loaders.buzzoola;

import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaBanner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/p;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface p {

    /* compiled from: BuzzoolaBanner.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(@Y61.k p pVar) {
            String f88261f;
            String str;
            int i12 = b.f88332a[pVar.getF88259d().f88309g.ordinal()];
            if (i12 != 1) {
                return (i12 != 2 || (f88261f = pVar.getF88261f()) == null || f88261f.length() == 0 || (str = pVar.getF88259d().f88308f) == null || str.length() == 0) ? false : true;
            }
            return true;
        }
    }

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88332a;

        static {
            int[] iArr = new int[BuzzoolaPromoType.values().length];
            try {
                iArr[BuzzoolaPromoType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuzzoolaPromoType.SOCIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88332a = iArr;
        }
    }

    @Y61.k
    /* renamed from: getConfig */
    BuzzoolaPremiumConfig getF88259d();

    @Y61.l
    /* renamed from: v */
    String getF88261f();
}
