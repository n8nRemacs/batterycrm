package com.avito.android.edit_address;

import com.avito.android.edit_address.EditAddressMviFragment;
import java.util.List;
import jy.InterfaceC42448f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditAddressMviView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "days", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class q extends N implements Y41.l<List<? extends Integer>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f146001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f146002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, String str) {
        super(1);
        this.f146001l = oVar;
        this.f146002m = str;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends Integer> list) {
        ((EditAddressMviFragment.b) this.f146001l.f145980f).invoke(new InterfaceC42448f.c(list, this.f146002m));
        return G0.f406611a;
    }
}
