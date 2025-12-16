package com.avito.android.avl_entry.impl.ui.external_item;

import com.avito.android.avl_entry.impl.util.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShortVideosItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/a$a;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avl_entry/impl/util/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<a.InterfaceC2959a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f98534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f98535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ig.d f98536n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, j jVar, Ig.d dVar) {
        super(1);
        this.f98534l = bVar;
        this.f98535m = jVar;
        this.f98536n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(a.InterfaceC2959a interfaceC2959a) {
        a.InterfaceC2959a interfaceC2959a2 = interfaceC2959a;
        boolean z12 = interfaceC2959a2 instanceof a.InterfaceC2959a.b;
        b bVar = this.f98534l;
        if (z12) {
            bVar.f98531i = true;
            bVar.f98524b.b(this.f98535m.l1(), this.f98536n.getStringId());
            bVar.f98527e.c(((a.InterfaceC2959a.b) interfaceC2959a2).f98615a);
        } else {
            if (interfaceC2959a2.equals(a.InterfaceC2959a.c.f98616a) ? true : interfaceC2959a2.equals(a.InterfaceC2959a.C2960a.f98614a)) {
                bVar.f98531i = false;
            }
        }
        return G0.f406611a;
    }
}
