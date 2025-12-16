package Jh;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.e;

/* compiled from: BeduinAttributedTextPairComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LJh/a;", "Lej/b;", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel;", "Lcom/avito/android/beduin/common/component/attributed_text_pair/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14197a implements InterfaceC40113b<BeduinAttributedTextPairModel, com.avito.android.beduin.common.component.attributed_text_pair.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f9099a;

    @Inject
    public C14197a(@k com.avito.android.util.text.a aVar) {
        this.f9099a = aVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, e eVar, InterfaceC15523b interfaceC15523b) {
        return new com.avito.android.beduin.common.component.attributed_text_pair.a(interfaceC15523b, this.f9099a, (BeduinAttributedTextPairModel) beduinModel);
    }
}
