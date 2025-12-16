package com.avito.android.ai_assistant.adapter.append;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppendItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/append/l;", "Lcom/avito/android/ai_assistant/adapter/append/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f88741e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Spinner f88742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f88743c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UU.a f88744d;

    public l(@Y61.k View view) throws Resources.NotFoundException {
        super(view);
        this.f88742b = (Spinner) view.findViewById(R.id.progress_spinner);
        this.f88743c = (Button) view.findViewById(R.id.retry_button);
        FV.a aVar = FV.a.f4720a;
        String string = view.getResources().getString(R.string.ai_assistant_append_retry);
        Context context = view.getContext();
        int iB2 = y6.b(4);
        aVar.getClass();
        this.f88744d = new UU.a(FV.a.i(string, context, R.attr.textIconRepeat, iB2), null, false, false, false, null, null, null, null, false, 1022, null);
    }

    @Override // com.avito.android.ai_assistant.adapter.append.k
    public final void YT() {
        D6.w(this.f88743c);
        D6.H(this.f88742b);
    }

    @Override // com.avito.android.ai_assistant.adapter.append.k
    public final void dW(@Y61.k Y41.a<G0> aVar) {
        D6.w(this.f88742b);
        Button button = this.f88743c;
        D6.H(button);
        button.setState(UU.a.a(this.f88744d, null, false, false, false, aVar, 991));
        button.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(3, aVar));
    }
}
