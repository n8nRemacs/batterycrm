package W9;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCampaign.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LW9/a;", "LSK0/c;", "a", "b", "LW9/a$a;", "LW9/a$b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a implements SK0.c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AdvertisementVerticalAlias f17805a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AdvertDetails f17806b;

    /* compiled from: AdvertDetailsCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW9/a$a;", "LW9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W9.a$a, reason: collision with other inner class name */
    public static final class C1256a extends a {

        /* compiled from: AdvertDetailsCampaign.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: W9.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1257a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17807a;

            static {
                int[] iArr = new int[AdvertisementVerticalAlias.values().length];
                try {
                    iArr[AdvertisementVerticalAlias.REALTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.AUTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.GENERAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.JOB.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.SERVICES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.NO_VALUE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f17807a = iArr;
            }
        }

        public C1256a(AdvertisementVerticalAlias advertisementVerticalAlias, AdvertDetails advertDetails, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : advertisementVerticalAlias, advertDetails, null);
        }

        @Override // W9.a
        @k
        public final String b(@l AdvertisementVerticalAlias advertisementVerticalAlias) {
            switch (advertisementVerticalAlias == null ? -1 : C1257a.f17807a[advertisementVerticalAlias.ordinal()]) {
                case -1:
                case 6:
                    return "backProductCart";
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return "backProductCartRealty";
                case 2:
                    return "backProductCartAuto";
                case 3:
                    return "backProductCartGeneral";
                case 4:
                    return "backProductCartJob";
                case 5:
                    return "backProductCartServices";
            }
        }
    }

    /* compiled from: AdvertDetailsCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW9/a$b;", "LW9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* compiled from: AdvertDetailsCampaign.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: W9.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C1258a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17808a;

            static {
                int[] iArr = new int[AdvertisementVerticalAlias.values().length];
                try {
                    iArr[AdvertisementVerticalAlias.REALTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.AUTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.GENERAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.JOB.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.SERVICES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AdvertisementVerticalAlias.NO_VALUE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f17808a = iArr;
            }
        }

        public b() {
            this(null, null, 3, null);
        }

        @Override // W9.a
        @k
        public final String b(@l AdvertisementVerticalAlias advertisementVerticalAlias) {
            switch (advertisementVerticalAlias == null ? -1 : C1258a.f17808a[advertisementVerticalAlias.ordinal()]) {
                case -1:
                case 6:
                    return "productCart";
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return "productCartRealty";
                case 2:
                    return "productCartAuto";
                case 3:
                    return "productCartGeneral";
                case 4:
                    return "productCartJob";
                case 5:
                    return "productCartServices";
            }
        }

        public b(AdvertisementVerticalAlias advertisementVerticalAlias, AdvertDetails advertDetails, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : advertisementVerticalAlias, (i12 & 2) != 0 ? null : advertDetails, null);
        }
    }

    public /* synthetic */ a(AdvertisementVerticalAlias advertisementVerticalAlias, AdvertDetails advertDetails, int i12, C42822w c42822w) {
        this(advertisementVerticalAlias, (i12 & 2) != 0 ? null : advertDetails, null);
    }

    @Override // SK0.c
    @k
    /* renamed from: a */
    public final String getF17809a() {
        return b(this.f17805a);
    }

    @k
    public abstract String b(@l AdvertisementVerticalAlias advertisementVerticalAlias);

    public a(AdvertisementVerticalAlias advertisementVerticalAlias, AdvertDetails advertDetails, C42822w c42822w) {
        this.f17805a = advertisementVerticalAlias;
        this.f17806b = advertDetails;
    }
}
