package com.avito.android.beduin.common.component.snippet_list_item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel;
import com.avito.android.beduin.common.utils.E;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSnippetListItem.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/component/snippet_list_item/b;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/avito/android/remote/model/Image;", "image", "Lkotlin/G0;", "setImage", "(Lcom/avito/android/remote/model/Image;)V", "", "Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$AttributedTextMaxLines;", "descriptions", "setDescriptions", "(Ljava/util/List;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f102650b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f102651c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f102652d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f102653e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f102654f;

    /* compiled from: BeduinSnippetListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "invoke", "()Lcom/avito/android/lib/design/text_view/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.lib.design.text_view.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lib.design.text_view.a invoke() {
            b bVar = b.this;
            LinearLayout linearLayout = bVar.f102651c;
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(bVar.getContext(), null, 0, 0, 14, null);
            linearLayout.addView(aVar);
            return aVar;
        }
    }

    public b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f102654f = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.comparison_snippet_list_item, (ViewGroup) this, true);
        this.f102650b = (SimpleDraweeView) findViewById(R.id.image);
        this.f102651c = (LinearLayout) findViewById(R.id.descriptions_container);
        this.f102652d = (FrameLayout) findViewById(R.id.right_icon_container);
        this.f102653e = (ImageView) findViewById(R.id.right_icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.SpannableStringBuilder] */
    public final void setDescriptions(@k List<BeduinSnippetListItemModel.AttributedTextMaxLines> descriptions) {
        int size;
        int iJ2;
        Object objInvoke;
        ?? text;
        Iterator it = descriptions.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f102654f;
            if (zHasNext) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                BeduinSnippetListItemModel.AttributedTextMaxLines attributedTextMaxLines = (BeduinSnippetListItemModel.AttributedTextMaxLines) next;
                a aVar = new a();
                if (i12 < arrayList.size()) {
                    objInvoke = arrayList.get(i12);
                } else {
                    objInvoke = aVar.invoke();
                    arrayList.add(objInvoke);
                }
                com.avito.android.lib.design.text_view.a aVar2 = (com.avito.android.lib.design.text_view.a) objInvoke;
                D6.H(aVar2);
                aVar2.setMaxLines(attributedTextMaxLines.getMaxLines());
                j.a(aVar2, attributedTextMaxLines.getAttributedText(), null);
                LocalIcon localIcon = attributedTextMaxLines.getLocalIcon();
                IconBase64 base64Icon = attributedTextMaxLines.getBase64Icon();
                IconPosition iconPosition = attributedTextMaxLines.getIconPosition();
                Drawable drawableC = v.c(aVar2.getContext(), localIcon, base64Icon);
                if (drawableC != null) {
                    drawableC.setBounds(0, 0, drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight());
                    text = new SpannableStringBuilder();
                    if ((iconPosition == null ? -1 : E.a.f103511a[iconPosition.ordinal()]) == 1) {
                        text.append("_ ");
                        text.append(aVar2.getText()).setSpan(new ImageSpan(drawableC, 0), 0, 1, 34);
                    } else {
                        text.append(aVar2.getText());
                        text.append(" _").setSpan(new ImageSpan(drawableC, 0), text.length() - 1, text.length(), 34);
                    }
                } else {
                    text = aVar2.getText();
                }
                I5.a(aVar2, text, false);
                i12 = i13;
            } else {
                if (descriptions.size() >= arrayList.size() || (size = descriptions.size()) > (iJ2 = C42745f0.J(arrayList))) {
                    return;
                }
                while (true) {
                    D6.w((View) arrayList.get(size));
                    if (size == iJ2) {
                        return;
                    } else {
                        size++;
                    }
                }
            }
        }
    }

    public final void setImage(@l Image image) {
        SimpleDraweeView simpleDraweeView = this.f102650b;
        if (image == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(n.a(image));
        aVarA.c();
    }
}
