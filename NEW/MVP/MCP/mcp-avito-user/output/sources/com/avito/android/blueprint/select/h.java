package com.avito.android.blueprint.select;

import Y61.k;
import Y61.l;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishSelectView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/select/h;", "LHj/c;", "Lcom/avito/android/blueprint/select/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends Hj.c implements g {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f105670n = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Input f105671m;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_select_content, aVar);
        this.f105671m = (Input) this.f7656e.findViewById(R.id.select);
    }

    @Override // Hj.c
    public final void B80() {
        Input.f179303W.getClass();
        this.f105671m.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprint.select.g
    public final void BZ() {
        this.f105671m.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // Hj.c
    public final void C80() {
        Input.f179303W.getClass();
        this.f105671m.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprint.select.g
    public final void Gk() {
        Input.p(this.f105671m, 0, 0, 3);
    }

    @Override // com.avito.android.blueprint.select.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f105671m.setOnClickListener(new j(5, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f105671m.setOnClickListener(null);
    }

    @Override // com.avito.android.blueprint.select.g
    public final void m(@l String str) {
        Input.t(this.f105671m, str, false, 6);
    }

    @Override // com.avito.android.blueprint.select.g
    public final void o(@l String str) {
        this.f105671m.setHint(str);
    }
}
