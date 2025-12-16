package com.avito.android.publish.details.adapter.objects.education;

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
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.text.AttributedText;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EducationListPreviewItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/education/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/objects/education/l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f233325f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233326b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f233327c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f233328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f233329e;

    public m(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f233326b = aVar;
        this.f233327c = view.getContext();
        this.f233328d = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.education_list_preview_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f233329e = (ComponentContainer) viewFindViewById;
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void F3(int i12, @Y61.k Y41.a aVar, @Y61.k String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233328d;
        ComponentContainer componentContainer = this.f233329e;
        View viewInflate = layoutInflater.inflate(R.layout.item_education_list_preview_button, (ViewGroup) componentContainer, false);
        View viewFindViewById = viewInflate.findViewById(R.id.item_education_list_add_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(5, aVar));
        componentContainer.addView(viewInflate, i12, viewInflate.getLayoutParams());
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void HL(int i12) {
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), i12, view.getPaddingRight(), view.getPaddingBottom());
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void clearItems() {
        this.f233329e.removeAllViews();
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF233327c() {
        return this.f233327c;
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void jg(int i12, @Y61.k Y41.a aVar, @Y61.k String str, @Y61.k String str2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflater layoutInflater = this.f233328d;
        ComponentContainer componentContainer = this.f233329e;
        View viewInflate = layoutInflater.inflate(R.layout.item_education_list_preview_item, (ViewGroup) componentContainer, false);
        ListItem listItem = (ListItem) viewInflate;
        listItem.setTitle(str);
        listItem.setSubtitle(str2);
        listItem.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(4, aVar));
        listItem.setId(i12);
        componentContainer.addView(viewInflate, -1, listItem.getLayoutParams());
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void k(@Y61.l AttributedText attributedText) {
        CharSequence charSequenceC = this.f233326b.c(this.itemView.getContext(), attributedText);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        ComponentContainer componentContainer = this.f233329e;
        componentContainer.setSubtitleMovementMethod(linkMovementMethod);
        componentContainer.setSubtitle(charSequenceC);
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void ma(@Y61.l CharSequence charSequence, @Y61.k int[] iArr) {
        ComponentContainer.l(this.f233329e, Arrays.copyOf(iArr, iArr.length), charSequence, 4);
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void s(@Y61.k String str) {
        this.f233329e.setTag(str);
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void setTitle(@Y61.l CharSequence charSequence) {
        this.f233329e.setTitle(charSequence);
    }

    @Override // com.avito.android.publish.details.adapter.objects.education.l
    public final void u(@Y61.l CharSequence charSequence) {
        this.f233329e.q(charSequence);
    }
}
