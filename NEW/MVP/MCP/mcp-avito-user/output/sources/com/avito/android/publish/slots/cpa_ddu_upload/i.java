package com.avito.android.publish.slots.cpa_ddu_upload;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.category_parameters.FileUploadButtonConfig;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35828k1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: CpaReassignmentSlotItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/cpa_ddu_upload/i;", "Lcom/avito/android/publish/slots/cpa_ddu_upload/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.l> f243355b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<String, Boolean>> f243356c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243357d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243358e;

    @Inject
    public i() {
        com.jakewharton.rxrelay3.c<ParameterElement.l> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243355b = cVar;
        com.jakewharton.rxrelay3.c<Q<String, Boolean>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243356c = cVar2;
        this.f243357d = new C41981q0(cVar);
        this.f243358e = new C41981q0(cVar2);
    }

    public static void O(l lVar, ItemWithState.State state, String str) {
        boolean z12 = state instanceof ItemWithState.State.Error;
        if (!z12) {
            str = null;
        }
        if (str != null) {
            lVar.f243365d.setText(str);
        }
        lVar.getClass();
        lVar.f243365d.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.cpa_ddu_upload.e
    @Y61.k
    /* renamed from: C0, reason: from getter */
    public final C41981q0 getF243357d() {
        return this.f243357d;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (ParameterElement.l) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        List<FileUploadParameterValue> list2;
        l lVar = (l) eVar;
        ParameterElement.l lVar2 = (ParameterElement.l) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35828k1) {
                obj = obj2;
            }
        }
        C35828k1 c35828k1 = (C35828k1) (obj instanceof C35828k1 ? obj : null);
        if (c35828k1 == null) {
            k(lVar, lVar2);
            return;
        }
        List<FileUploadParameterValue> list3 = lVar2.f117458h;
        List<FileUploadParameterValue> list4 = c35828k1.f318913a;
        if (list4 != null) {
            lVar.B80(new f(2, this, i.class, "onDeleteClick", "onDeleteClick(Ljava/lang/String;Z)V", 0), list4);
            lVar.f243364c.setVisibility(O2.a(list3) ? 0 : 8);
        }
        ItemWithState.State state = c35828k1.f318914b;
        if (state != null) {
            O(lVar, state, lVar2.f117463m);
        }
        List<FileUploadParameterValue> list5 = list3;
        boolean z12 = (list5 == null || list5.isEmpty()) && ((list2 = list4) == null || list2.isEmpty());
        lVar.getClass();
        lVar.f243363b.setVisibility(z12 ? 0 : 8);
    }

    public final void k(@Y61.k l lVar, @Y61.k ParameterElement.l lVar2) {
        Drawable drawableH;
        k kVar = new k(0, new g(this, lVar2));
        Button button = lVar.f243363b;
        button.setOnClickListener(kVar);
        FileUploadButtonConfig fileUploadButtonConfig = lVar2.f117459i;
        if (fileUploadButtonConfig != null) {
            Integer numA = q.a(fileUploadButtonConfig.getIcon());
            if (numA != null && (drawableH = C35835l0.h(numA.intValue(), button.getContext())) != null) {
                Button.g(button, drawableH, null, false, null, 14);
            }
            button.setText(fileUploadButtonConfig.getText());
        }
        int i12 = 0;
        String str = lVar2.f117464n;
        if (str != null) {
            I5.a(lVar.f243367f, str, false);
        }
        AttributedText attributedText = lVar2.f117460j;
        if (attributedText != null) {
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            TextView textView = lVar.f243366e;
            textView.setMovementMethod(linkMovementMethod);
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
        h hVar = new h(2, this, i.class, "onDeleteClick", "onDeleteClick(Ljava/lang/String;Z)V", 0);
        List<FileUploadParameterValue> list = lVar2.f117458h;
        lVar.B80(hVar, list);
        lVar.f243364c.setVisibility(O2.a(list) ? 0 : 8);
        O(lVar, lVar2.f117454d, lVar2.f117463m);
        List<FileUploadParameterValue> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            i12 = 8;
        }
        lVar.f243363b.setVisibility(i12);
    }

    @Override // com.avito.android.publish.slots.cpa_ddu_upload.e
    @Y61.k
    /* renamed from: w0, reason: from getter */
    public final C41981q0 getF243358e() {
        return this.f243358e;
    }
}
