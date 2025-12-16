package com.avito.android.recall_me.presentation.items.single_input;

import Y61.l;
import android.text.Editable;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35843m0;
import com.avito.android.util.W3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FilterPositionFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/single_input/b;", "Lcom/avito/android/util/W3;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends W3 {

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f251956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Input f251957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f251958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Input input, a aVar, Y41.l<? super String, G0> lVar) {
        super(aVar);
        this.f251957f = input;
        this.f251958g = lVar;
        this.f251956e = input.getDeformattedText();
    }

    @Override // com.avito.android.util.W3, com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void afterTextChanged(@Y61.k Editable editable) {
        super.afterTextChanged(editable);
        C35843m0 c35843m0 = this.f318772d;
        if (c35843m0 != null) {
            String str = this.f251956e;
            String str2 = c35843m0.f318924a;
            if (!L.f(str2, str)) {
                ((g) this.f251958g).invoke(this.f251957f.getDeformattedText());
            }
            this.f251956e = str2;
        }
    }
}
