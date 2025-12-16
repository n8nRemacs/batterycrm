package com.avito.android.mortgage.landing.list.items.input;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w00.InterfaceC49409a;

/* compiled from: InputPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasFocus", "", "value", "Lkotlin/G0;", "invoke", "(ZLjava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements p<Boolean, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f199749l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InputItem f199750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, InputItem inputItem) {
        super(2);
        this.f199749l = hVar;
        this.f199750m = inputItem;
    }

    @Override // Y41.p
    public final G0 invoke(Boolean bool, String str) {
        String str2 = str;
        if (!bool.booleanValue()) {
            this.f199749l.f199757b.invoke(new InterfaceC49409a.i(this.f199750m.f199729b, str2));
        }
        return G0.f406611a;
    }
}
