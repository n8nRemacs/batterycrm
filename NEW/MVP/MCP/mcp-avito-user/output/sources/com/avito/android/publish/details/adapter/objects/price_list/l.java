package com.avito.android.publish.details.adapter.objects.price_list;

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
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42165v;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PriceListPreviewItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/price_list/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/objects/price_list/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f233380f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233381b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f233382c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f233383d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f233384e;

    public l(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f233381b = aVar;
        this.f233382c = view.getContext();
        this.f233383d = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.price_list_preview_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f233384e = (ComponentContainer) viewFindViewById;
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void F3(@InterfaceC42165v int i12, @Y61.k Y41.a aVar, @Y61.k String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233383d;
        ComponentContainer componentContainer = this.f233384e;
        View viewInflate = layoutInflater.inflate(R.layout.item_price_list_preview_button, (ViewGroup) componentContainer, false);
        Button button = (Button) viewInflate;
        button.setText(str);
        Button.h(button, i12, 0, 2);
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(6, aVar));
        componentContainer.addView(viewInflate, -1, button.getLayoutParams());
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void H(@Y61.l CharSequence charSequence) {
        ComponentContainer.l(this.f233384e, new int[0], charSequence, 4);
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void Xb(@Y61.k String str, @Y61.k String str2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233383d;
        ComponentContainer componentContainer = this.f233384e;
        View viewInflate = layoutInflater.inflate(R.layout.item_price_list_preview_dotted_text, (ViewGroup) componentContainer, false);
        DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) viewInflate;
        descriptionParameterItem.getLeftTextView().setText(str);
        descriptionParameterItem.getRightTextView().setText(str2);
        componentContainer.addView(viewInflate, -1, descriptionParameterItem.getLayoutParams());
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void clearItems() {
        this.f233384e.removeAllViews();
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF233382c() {
        return this.f233382c;
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void k(@Y61.l AttributedText attributedText) {
        CharSequence charSequenceC = this.f233381b.c(this.f233382c, attributedText);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        ComponentContainer componentContainer = this.f233384e;
        componentContainer.setSubtitleMovementMethod(linkMovementMethod);
        componentContainer.setSubtitle(charSequenceC);
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void s(@Y61.k String str) {
        this.f233384e.setTag(str);
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void setTitle(@Y61.l CharSequence charSequence) {
        this.f233384e.setTitle(charSequence);
    }

    @Override // com.avito.android.publish.details.adapter.objects.price_list.k
    public final void u(@Y61.l CharSequence charSequence) {
        this.f233384e.q(charSequence);
    }
}
