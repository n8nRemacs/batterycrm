package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.AbstractC25542c;
import bP0.C25543d;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm;
import com.avito.android.wallet.page.topup.form.remote.dto.TopUpHint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.info_label.InfoLevel;

/* compiled from: TopUpFormViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/q;", "", "<init>", "()V", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {

    /* compiled from: TopUpFormViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/q$a;", "", "<init>", "()V", "", "INFO_LABEL_ID", "Ljava/lang/String;", "SHORTCUT_SECTION_ID", "SUBMIT_BUTTON_ID", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public q() {
    }

    public static C25543d a(q qVar, C25543d c25543d, boolean z12, boolean z13, int i12) {
        AbstractC25542c aVar;
        ru.avito.component.info_label.g gVar;
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        if ((i12 & 4) != 0) {
            z13 = false;
        }
        qVar.getClass();
        C25543d.b bVar = c25543d.f57063b;
        if (bVar instanceof C25543d.b.C2001b) {
            aVar = AbstractC25542c.b.f57060a;
        } else {
            if (!(bVar instanceof C25543d.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            TopUpForm topUpForm = ((C25543d.b.a) bVar).f57066a;
            IntParameter intParameter = (IntParameter) c25543d.f57064c.getFirstParameterOfType(IntParameter.class);
            String title = topUpForm.getTitle();
            kotlin.collections.builders.b bVarT = C42745f0.t();
            if (intParameter != null) {
                String id2 = intParameter.getId();
                Long value = intParameter.getValue();
                String string = value != null ? value.toString() : null;
                if (string == null) {
                    string = "";
                }
                bVarT.add(new com.avito.android.wallet.page.topup.form.items.input.a(id2, string, z12));
                AttributedText errorMessage = intParameter.getErrorMessage();
                if (errorMessage != null) {
                    String str = intParameter.getId() + " info_label";
                    String text = errorMessage.getText();
                    InfoLevel infoLevel = InfoLevel.f430349b;
                    gVar = new ru.avito.component.info_label.g(str, text);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    bVarT.add(gVar);
                }
                List<TopUpHint> listD = topUpForm.d();
                ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.avito.android.wallet.page.topup.form.items.bubble.a(intParameter.getId(), String.valueOf(((TopUpHint) it.next()).getValue())));
                }
                bVarT.add(new com.avito.android.wallet.page.topup.form.items.shortcut_section.c(arrayList));
                bVarT.add(new com.avito.android.wallet.page.topup.form.items.submit_button_item.c(!intParameter.hasError(), topUpForm.getSubmitText()));
            }
            aVar = new AbstractC25542c.a(title, C42745f0.p(bVarT), z13);
        }
        return C25543d.a(c25543d, null, null, aVar, 3);
    }
}
