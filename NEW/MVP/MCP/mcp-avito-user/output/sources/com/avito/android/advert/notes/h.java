package com.avito.android.advert.notes;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.Y5;
import fa.InterfaceC40383a;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditAdvertNoteInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/notes/h;", "Lcom/avito/android/advert/notes/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40383a f80909a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f80910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f80911c;

    @Inject
    public h(@Y61.k InterfaceC40383a interfaceC40383a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f80909a = interfaceC40383a;
        this.f80910b = interfaceC35745a5;
        this.f80911c = fVar;
    }

    @Override // com.avito.android.advert.notes.c
    @Y61.k
    public final z<P2<UpdateAdvertNoteResult>> a(@Y61.k String str, @Y61.k String str2, boolean z12) {
        InterfaceC35745a5 interfaceC35745a5 = this.f80910b;
        InterfaceC40383a interfaceC40383a = this.f80909a;
        return z12 ? z.q(z.c0(P2.c.f318721a), Y5.a(interfaceC40383a.h(str, str2)).d0(d.f80883b).m0(new e(this)).x0(interfaceC35745a5.a())) : z.q(z.c0(P2.c.f318721a), Y5.a(interfaceC40383a.e(str, str2)).d0(f.f80907b).m0(new g(this)).x0(interfaceC35745a5.a()));
    }
}
