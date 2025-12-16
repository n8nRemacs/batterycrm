package com.avito.android.publish.details.adapter.objects;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.validation.InterfaceC36016k;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateObjectsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/objects/i;", "Lcom/avito/android/validation/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i, InterfaceC36016k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f233338f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f233340c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f233341d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f233342e;

    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f233339b = aVar;
        this.f233340c = view.getContext();
        this.f233341d = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.objects_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f233342e = (ComponentContainer) viewFindViewById;
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void Q60(@Y61.k String str, @Y61.k Y41.a<G0> aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233341d;
        ComponentContainer componentContainer = this.f233342e;
        View viewInflate = layoutInflater.inflate(R.layout.redesign_objects_item_add_more_view, (ViewGroup) componentContainer, false);
        Button button = (Button) viewInflate;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(3, aVar));
        componentContainer.addView(viewInflate, -1, button.getLayoutParams());
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void clearItems() {
        this.f233342e.removeAllViews();
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF233340c() {
        return this.f233340c;
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void k(@Y61.l AttributedText attributedText) {
        CharSequence charSequenceC = this.f233339b.c(this.f233340c, attributedText);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        ComponentContainer componentContainer = this.f233342e;
        componentContainer.setSubtitleMovementMethod(linkMovementMethod);
        componentContainer.setSubtitle(charSequenceC);
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void ma(@Y61.l CharSequence charSequence, @Y61.k int[] iArr) {
        ComponentContainer.l(this.f233342e, Arrays.copyOf(iArr, iArr.length), charSequence, 4);
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void ns(int i12, @Y61.k Y41.a aVar, @Y61.k String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233341d;
        ComponentContainer componentContainer = this.f233342e;
        View viewInflate = layoutInflater.inflate(R.layout.objects_item_select_view, (ViewGroup) componentContainer, false);
        Input input = (Input) viewInflate;
        Input.t(input, str, false, 6);
        input.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(1, aVar));
        input.setId(i12);
        componentContainer.addView(viewInflate, -1, input.getLayoutParams());
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void s(@Y61.k String str) {
        this.f233342e.setTag(str);
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void setTitle(@Y61.l CharSequence charSequence) {
        this.f233342e.setTitle(charSequence);
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void u(@Y61.l CharSequence charSequence) {
        this.f233342e.q(charSequence);
    }

    @Override // com.avito.android.publish.details.adapter.objects.i
    public final void yo(@Y61.k Y41.a<G0> aVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233341d;
        ComponentContainer componentContainer = this.f233342e;
        View viewInflate = layoutInflater.inflate(R.layout.objects_item_add_more_view, (ViewGroup) componentContainer, false);
        Input input = (Input) viewInflate;
        input.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(2, aVar));
        componentContainer.addView(viewInflate, -1, input.getLayoutParams());
    }
}
