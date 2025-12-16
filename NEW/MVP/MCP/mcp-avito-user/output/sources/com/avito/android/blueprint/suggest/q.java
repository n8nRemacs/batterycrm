package com.avito.android.blueprint.suggest;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "formattedValue", "", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/CharSequence;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.p<CharSequence, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f105728l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f105729m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, ParameterElement.H h12) {
        super(2);
        this.f105728l = wVar;
        this.f105729m = h12;
    }

    @Override // Y41.p
    public final G0 invoke(CharSequence charSequence, String str) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        if (string == null) {
            string = "";
        }
        w wVar = this.f105728l;
        ParameterElement.H h12 = this.f105729m;
        h12.f117300f = str2;
        if (h12.f117302h) {
            wVar.f105746k.accept(new D(h12.f117181b, string));
        }
        wVar.f105744i.accept(h12);
        return G0.f406611a;
    }
}
