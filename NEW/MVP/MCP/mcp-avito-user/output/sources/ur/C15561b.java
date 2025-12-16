package Ur;

import Rr.C15074b;
import Rr.e;
import Rr.f;
import Rr.g;
import Y61.k;
import Zx.C19616a;
import androidx.compose.runtime.internal.P;
import com.avito.android.A0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: CptMassActivationMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUr/b;", "LUr/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ur.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15561b implements InterfaceC15560a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C19616a f16692a;

    @Inject
    public C15561b(@k C19616a c19616a) {
        this.f16692a = c19616a;
    }

    @Override // Ur.InterfaceC15560a
    @k
    public final ArrayList a(@k g gVar) {
        f fVarA;
        f fVarA2;
        ArrayList arrayList = new ArrayList();
        C19616a c19616a = this.f16692a;
        c19616a.getClass();
        n<Object> nVar = C19616a.f20576q[7];
        A0.a aVar = c19616a.f20584i;
        if (!((Boolean) aVar.a().invoke()).booleanValue()) {
            arrayList.add(new com.avito.android.cpt.mass_activation.ui.items.header.c(gVar.getTitle(), gVar.getDescription()));
        }
        int i12 = 0;
        for (Object obj : gVar.d()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C15074b c15074b = (C15074b) obj;
            n<Object> nVar2 = C19616a.f20576q[7];
            if (((Boolean) aVar.a().invoke()).booleanValue()) {
                e fee = c15074b.getFee();
                com.avito.android.cpt.mass_activation.ui.items.advert_v2.k kVar = (fee == null || (fVarA2 = fee.getExtraInfoTooltip()) == null) ? null : new com.avito.android.cpt.mass_activation.ui.items.advert_v2.k(fVarA2.getTitle(), fVarA2.getDescription());
                String strG = AK.c.g(i12, "cpt_mass_activation_advert_");
                Image image = c15074b.getImage();
                AttributedText title = c15074b.getTitle();
                AttributedText description = c15074b.getDescription();
                e fee2 = c15074b.getFee();
                AttributedText attributedTextB = fee2 != null ? fee2.getText() : null;
                Rr.c fbsFee = c15074b.getFbsFee();
                arrayList.add(new com.avito.android.cpt.mass_activation.ui.items.advert_v2.c(strG, image, title, description, attributedTextB, fbsFee != null ? fbsFee.getText() : null, kVar));
            } else {
                e fee3 = c15074b.getFee();
                com.avito.android.cpt.mass_activation.ui.items.advert.k kVar2 = (fee3 == null || (fVarA = fee3.getExtraInfoTooltip()) == null) ? null : new com.avito.android.cpt.mass_activation.ui.items.advert.k(fVarA.getTitle(), fVarA.getDescription());
                String strG2 = AK.c.g(i12, "cpt_mass_activation_advert_");
                Image image2 = c15074b.getImage();
                AttributedText title2 = c15074b.getTitle();
                AttributedText description2 = c15074b.getDescription();
                e fee4 = c15074b.getFee();
                AttributedText attributedTextB2 = fee4 != null ? fee4.getText() : null;
                Rr.c fbsFee2 = c15074b.getFbsFee();
                arrayList.add(new com.avito.android.cpt.mass_activation.ui.items.advert.c(strG2, image2, title2, description2, attributedTextB2, fbsFee2 != null ? fbsFee2.getText() : null, kVar2));
            }
            i12 = i13;
        }
        return arrayList;
    }
}
