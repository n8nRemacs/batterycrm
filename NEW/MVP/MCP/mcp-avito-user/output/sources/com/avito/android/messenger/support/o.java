package com.avito.android.messenger.support;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.support.j;
import com.avito.android.util.C35971x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SupportChatFormView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/support/o;", "Lcom/avito/android/messenger/support/n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f197421f = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/support/SupportChatFormPresenter$State;", o.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f197422b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f197423c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<CharSequence> f197424d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C35971x f197425e;

    /* compiled from: SupportChatFormView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/support/o$b", "Landroid/view/View$OnClickListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public long f197427b;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Y61.l View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.f197427b < 1000) {
                return;
            }
            this.f197427b = jElapsedRealtime;
            o oVar = o.this;
            Editable editableM53getText = oVar.f197422b.m53getText();
            if (editableM53getText == null || C43066x.K(editableM53getText)) {
                return;
            }
            oVar.f197423c.setEnabled(false);
            oVar.f197423c.setLoading(true);
            oVar.f197422b.setEnabled(false);
            oVar.f197424d.accept(editableM53getText);
        }
    }

    public o(@Y61.k View view) {
        Input input = (Input) view.findViewById(R.id.messenger_support_chat_form_input);
        this.f197422b = input;
        Button button = (Button) view.findViewById(R.id.messenger_support_chat_form_send_button);
        this.f197423c = button;
        this.f197424d = new com.jakewharton.rxrelay3.c<>();
        this.f197425e = new C35971x();
        input.b(new a());
        button.setOnClickListener(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final j.b a(com.avito.android.mvi.e<j.b> eVar) {
        kotlin.reflect.n<Object> nVar = f197421f[0];
        return (j.b) this.f197425e.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.support.j$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f197421f[0];
        this.f197425e.f319122b = (j.b) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<j.b> eVar, j.b bVar, j.b bVar2) {
        j.b bVar3 = bVar;
        j.a.C5814a c5814a = j.a.C5814a.f197394a;
        j.a aVar = bVar2.f197399a;
        if (!L.f(aVar, c5814a)) {
            if (aVar instanceof j.a.b) {
                return;
            }
            boolean z12 = aVar instanceof j.a.c;
            return;
        }
        if ((bVar3 != null ? bVar3.f197399a : null) != c5814a) {
            Input input = this.f197422b;
            Editable editableM53getText = input.m53getText();
            boolean z13 = editableM53getText == null || C43066x.K(editableM53getText);
            Button button = this.f197423c;
            button.setEnabled(!z13);
            button.setLoading(false);
            input.setEnabled(true);
        }
    }

    /* compiled from: SupportChatFormView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/support/o$a", "Landroid/text/TextWatcher;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.k Editable editable) {
            o.this.f197423c.setEnabled(!C43066x.K(editable));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
