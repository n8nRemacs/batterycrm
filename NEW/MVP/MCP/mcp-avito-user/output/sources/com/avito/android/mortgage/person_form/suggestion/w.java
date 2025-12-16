package com.avito.android.mortgage.person_form.suggestion;

import android.content.Context;
import android.text.TextWatcher;
import androidx.compose.runtime.InterfaceC22204y1;
import ca1.C27140f;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestionScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/input/Input;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w extends N implements Y41.l<Context, Input> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H00.c f201515l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f201516m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<TextWatcher> f201517n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f201518o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(H00.c cVar, Y41.l<? super String, G0> lVar, InterfaceC22204y1<TextWatcher> interfaceC22204y1, Y41.a<G0> aVar) {
        super(1);
        this.f201515l = cVar;
        this.f201516m = (N) lVar;
        this.f201517n = interfaceC22204y1;
        this.f201518o = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Input invoke(Context context) {
        Input input = new Input(context, null, 0, 0, 14, null);
        input.setClearButton(true);
        this.f201517n.setValue(com.avito.android.lib.design.input.n.c(input, new v(this.f201516m)));
        H00.c cVar = this.f201515l;
        Input.t(input, cVar.f6916d, false, 6);
        input.setHint(cVar.f6917e);
        input.requestFocus();
        input.post(new com.avito.android.lib.design.input.g(input, 2));
        input.setOnEditorActionListener(new C27140f(this.f201518o));
        return input;
    }
}
