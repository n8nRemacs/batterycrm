package Qh;

import Y61.k;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IconTokenMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQh/a;", "Landroid/text/style/ClickableSpan;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14895a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken.a f13981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<BeduinAction> f13982c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14895a(com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken.a aVar, List<? extends BeduinAction> list) {
        this.f13981b = aVar;
        this.f13982c = list;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f13981b.f101684a, this.f13982c);
    }
}
