package com.avito.android.mortgage.person_form.list.items.chips;

import E00.b;
import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f200670l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChipsItem f200671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ChipsItem chipsItem) {
        super(1);
        this.f200670l = eVar;
        this.f200671m = chipsItem;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f200670l.f200674b.invoke(new b.z(this.f200671m.f200654b, str));
        return G0.f406611a;
    }
}
