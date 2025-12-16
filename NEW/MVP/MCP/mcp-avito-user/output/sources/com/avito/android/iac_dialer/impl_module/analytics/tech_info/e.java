package com.avito.android.iac_dialer.impl_module.analytics.tech_info;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: IacTechInfoStorage.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/e;", "Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class e implements IacTechInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.analytics.tech_info.a f165725a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public volatile Map<String, ? extends Q<? extends IacCallDirection, ? extends List<IacTechInfoStorage.a>>> f165726b = P0.c();

    /* compiled from: IacTechInfoStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/e$a;", "", "<init>", "()V", "", "INCOMING", "Ljava/lang/String;", "OUTGOING", "PARAMS_DELIMETER", "WORDS_DELIMETER", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacTechInfoStorage.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage$a;", "param", "", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage$a;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<IacTechInfoStorage.a, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacCallDirection f165727l;

        /* compiled from: IacTechInfoStorage.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f165728a;

            static {
                int[] iArr = new int[IacCallDirection.values().length];
                try {
                    iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IacCallDirection.INCOMING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f165728a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacCallDirection iacCallDirection) {
            super(1);
            this.f165727l = iacCallDirection;
        }

        @Override // Y41.l
        public final CharSequence invoke(IacTechInfoStorage.a aVar) {
            IacTechInfoStorage.a aVar2 = aVar;
            StringBuilder sb2 = new StringBuilder();
            int i12 = a.f165728a[this.f165727l.ordinal()];
            if (i12 == 1) {
                C43066x.k(sb2, "out", "_");
            } else if (i12 == 2) {
                C43066x.k(sb2, "in", "_");
            }
            sb2.append(aVar2);
            return sb2.toString();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k com.avito.android.iac_dialer.impl_module.analytics.tech_info.a aVar) {
        this.f165725a = aVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage
    public final void a(@k String str, @k IacCallDirection iacCallDirection, @Y61.l List<String> list) {
        this.f165726b = P0.l(this.f165726b, new Q(str, new Q(iacCallDirection, this.f165725a.a(list))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage
    @Y61.l
    public final synchronized String b(@k String str) {
        Q<? extends IacCallDirection, ? extends List<IacTechInfoStorage.a>> q12 = this.f165726b.get(str);
        if (q12 == null) {
            return null;
        }
        return C42745f0.O((List) q12.f406620c, ",", null, null, new b((IacCallDirection) q12.f406619b), 30);
    }
}
