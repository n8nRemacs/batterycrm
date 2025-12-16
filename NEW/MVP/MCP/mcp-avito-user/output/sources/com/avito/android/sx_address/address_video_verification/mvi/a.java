package com.avito.android.sx_address.address_video_verification.mvi;

import BA0.a;
import BA0.b;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressVideoVerificationActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LBA0/a;", "LBA0/b;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationState;", "b", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<BA0.a, BA0.b, SxAddressVideoVerificationState> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f292669f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<List<String>> f292670g = C42727D.c(C8880a.f292676l);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.address_video_verification.domain.d f292671a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50429b f292672b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SxAddressVideoVerificationParams f292673c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f292674d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.address_video_verification.view.d f292675e;

    /* compiled from: SxAddressVideoVerificationActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.address_video_verification.mvi.a$a, reason: collision with other inner class name */
    public static final class C8880a extends N implements Y41.a<List<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8880a f292676l = new C8880a();

        public C8880a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends String> invoke() {
            return C42745f0.U("mp4", "avi", "wmv", "mov", "flv");
        }
    }

    /* compiled from: SxAddressVideoVerificationActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/a$b;", "", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.sx_address.address_video_verification.domain.d dVar, @Y61.k InterfaceC50429b interfaceC50429b, @Y61.k SxAddressVideoVerificationParams sxAddressVideoVerificationParams, @Y61.k R0 r02, @Y61.k com.avito.android.sx_address.address_video_verification.view.d dVar2) {
        this.f292671a = dVar;
        this.f292672b = interfaceC50429b;
        this.f292673c = sxAddressVideoVerificationParams;
        this.f292674d = r02;
        this.f292675e = dVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BA0.b> b(BA0.a aVar, SxAddressVideoVerificationState sxAddressVideoVerificationState) {
        BA0.a aVar2 = aVar;
        SxAddressVideoVerificationState sxAddressVideoVerificationState2 = sxAddressVideoVerificationState;
        if (aVar2.equals(a.C0042a.f1207a)) {
            return new C43210w(b.a.f1213a);
        }
        boolean zEquals = aVar2.equals(a.f.f1212a);
        SxAddressVideoVerificationParams sxAddressVideoVerificationParams = this.f292673c;
        if (zEquals) {
            this.f292672b.e(sxAddressVideoVerificationParams.f292545b);
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            f292669f.getClass();
            List<String> value = f292670g.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension((String) it.next());
                if (mimeTypeFromExtension != null) {
                    arrayList.add(mimeTypeFromExtension);
                }
            }
            return new C43210w(new b.c(arrayList));
        }
        if (aVar2 instanceof a.e) {
            return C43175k.G(new com.avito.android.sx_address.address_video_verification.mvi.b(aVar2, this, sxAddressVideoVerificationState2, null));
        }
        boolean zEquals2 = aVar2.equals(a.b.f1208a);
        com.avito.android.sx_address.address_video_verification.domain.d dVar = this.f292671a;
        if (zEquals2) {
            dVar.b();
            return new C43210w(b.C0043b.f1214a);
        }
        if (aVar2.equals(a.d.f1210a)) {
            return C43175k.I(this.f292674d.a(), new C43152f0(C43175k.G(new c(sxAddressVideoVerificationState2, this, null)), new d(this, null)));
        }
        if (aVar2.equals(a.c.f1209a)) {
            return dVar.d(sxAddressVideoVerificationParams.f292545b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
