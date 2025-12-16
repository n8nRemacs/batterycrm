package com.avito.android.screens.bbip_private.ui.items.duration;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateDurationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "durationItem", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f260845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f260846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f260847n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f260848o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, g gVar, i iVar, b bVar) {
        super(1);
        this.f260845l = str;
        this.f260846m = gVar;
        this.f260847n = iVar;
        this.f260848o = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) throws NumberFormatException {
        String str2 = str;
        boolean zEquals = str2.equals(this.f260845l);
        g gVar = this.f260846m;
        if (!zEquals) {
            int i12 = 0;
            while (true) {
                if (i12 >= str2.length()) {
                    gVar.f260849b.invoke(Integer.valueOf(Integer.parseInt(str2)));
                    break;
                }
                if (!Character.isDigit(str2.charAt(i12))) {
                    break;
                }
                i12++;
            }
        } else {
            gVar.getClass();
            b bVar = this.f260848o;
            String str3 = bVar.f260839j;
            int i13 = gVar.f260850c;
            ArrayList arrayList = bVar.f260833d;
            this.f260847n.NA(i13, gVar.f260849b, str3, bVar.f260840k, arrayList);
        }
        return G0.f406611a;
    }
}
