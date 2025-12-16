package com.avito.android.beduin.common.component.list_item;

import Rh.C15041a;
import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.list_item.BeduinListItemModel;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinListItemComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel;", "Lcom/avito/android/lib/design/list_item/ListItem;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinListItemModel, ListItem> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101696e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinListItemModel f101697f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f101698g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f101699h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f101700i = true;

    /* compiled from: BeduinListItemComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.list_item.a$a, reason: collision with other inner class name */
    public static final class C3047a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3047a f101701a = new C3047a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101702b = Collections.singletonList("listItem");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinListItemModel> f101703c = BeduinListItemModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinListItemModel> S() {
            return f101703c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101702b;
        }
    }

    /* compiled from: BeduinListItemComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101704a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101705b;

        static {
            int[] iArr = new int[BeduinListItemModel.Style.values().length];
            try {
                iArr[BeduinListItemModel.Style.GRAY_SUBTITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinListItemModel.Style.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101704a = iArr;
            int[] iArr2 = new int[BeduinListItemModel.Icon.Alignment.values().length];
            try {
                iArr2[BeduinListItemModel.Icon.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BeduinListItemModel.Icon.Alignment.FIRST_LINE_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f101705b = iArr2;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinListItemModel beduinListItemModel, @k com.avito.android.util.text.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f101696e = interfaceC15523b;
        this.f101697f = beduinListItemModel;
        this.f101698g = aVar;
        this.f101699h = aVar2;
    }

    public static BaseListItem.Alignment u(BeduinListItemModel.Icon.Alignment alignment) {
        int i12 = alignment == null ? -1 : b.f101705b[alignment.ordinal()];
        if (i12 == -1 || i12 == 1) {
            return BaseListItem.Alignment.f179500b;
        }
        if (i12 == 2) {
            return BaseListItem.Alignment.f179501c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101697f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102207l() {
        return this.f101700i;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ListItem listItem = new ListItem(viewGroup.getContext(), null);
        listItem.setId(R.id.beduin_list_item);
        listItem.setLayoutParams(layoutParams);
        if (this.f395326d) {
            D6.f(listItem, this.f395324b, 0, this.f395325c, 0, 10);
        } else {
            listItem.setPadding(0, 0, 0, 0);
        }
        return listItem;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        int i12;
        BeduinListItemModel.Icon.RemoteIcon remoteIcon;
        BeduinListItemModel.Icon.RemoteIcon remoteIcon2;
        ListItem listItem = (ListItem) view;
        Context context = listItem.getContext();
        BeduinListItemModel beduinListItemModel = this.f101697f;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(beduinListItemModel.getTheme()));
        BeduinListItemModel.Style style = beduinListItemModel.getStyle();
        int i13 = style == null ? -1 : b.f101704a[style.ordinal()];
        if (i13 == -1) {
            i12 = R.attr.listItem;
        } else if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.listItem;
        } else {
            i12 = R.attr.listItemGraySubtitle;
        }
        listItem.setAppearance(C35835l0.j(i12, contextThemeWrapper));
        j.a(listItem, beduinListItemModel.getActions(), this.f101696e);
        listItem.setTitle(beduinListItemModel.getTitle());
        AttributedText attributedSubtitle = beduinListItemModel.getAttributedSubtitle();
        if (attributedSubtitle != null) {
            attributedSubtitle.setOnDeepLinkClickListener(new C15041a(this, 0));
        } else {
            attributedSubtitle = null;
        }
        CharSequence charSequenceC = this.f101698g.c(contextThemeWrapper, attributedSubtitle);
        if (charSequenceC == null) {
            charSequenceC = beduinListItemModel.getSubtitle();
        }
        listItem.setSubtitle(charSequenceC);
        listItem.setMessage(beduinListItemModel.getDetails());
        BeduinListItemModel.Link link = beduinListItemModel.getLink();
        listItem.setLink(link != null ? link.getText() : null);
        final int i14 = 0;
        listItem.setLinkClickedListener(new View.OnClickListener(this) { // from class: Rh.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.beduin.common.component.list_item.a f14559c;

            {
                this.f14559c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                List<BeduinAction> actions;
                List<BeduinAction> actions2;
                switch (i14) {
                    case 0:
                        com.avito.android.beduin.common.component.list_item.a aVar = this.f14559c;
                        BeduinListItemModel.Link link2 = aVar.f101697f.getLink();
                        if (link2 != null && (actions = link2.getActions()) != null) {
                            Iterator<T> it = actions.iterator();
                            while (it.hasNext()) {
                                aVar.f101696e.o((BeduinAction) it.next());
                            }
                            break;
                        }
                        break;
                    default:
                        com.avito.android.beduin.common.component.list_item.a aVar2 = this.f14559c;
                        BeduinListItemModel.Icon.Right rightIcon = aVar2.f101697f.getRightIcon();
                        if (rightIcon != null && (actions2 = rightIcon.getActions()) != null) {
                            Iterator<T> it2 = actions2.iterator();
                            while (it2.hasNext()) {
                                aVar2.f101696e.o((BeduinAction) it2.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
        BeduinListItemModel.Icon.Left leftIcon = beduinListItemModel.getLeftIcon();
        listItem.setLeftAlignment(u(leftIcon != null ? leftIcon.getAlignment() : null));
        BeduinListItemModel.Icon.Right rightIcon = beduinListItemModel.getRightIcon();
        listItem.setRightAlignment(u(rightIcon != null ? rightIcon.getAlignment() : null));
        BeduinListItemModel.Icon.Left leftIcon2 = beduinListItemModel.getLeftIcon();
        Q q12 = (leftIcon2 == null || (remoteIcon2 = leftIcon2.getRemoteIcon()) == null) ? null : new Q(remoteIcon2.getImage(), remoteIcon2.getSize());
        Context context2 = listItem.getContext();
        BeduinListItemModel.Icon.Left leftIcon3 = beduinListItemModel.getLeftIcon();
        LocalIcon localIcon = leftIcon3 != null ? leftIcon3.getLocalIcon() : null;
        BeduinListItemModel.Icon.Left leftIcon4 = beduinListItemModel.getLeftIcon();
        Drawable drawableC = v.c(context2, localIcon, leftIcon4 != null ? leftIcon4.getBase64Icon() : null);
        BeduinListItemModel.Icon.Right rightIcon2 = beduinListItemModel.getRightIcon();
        Q q13 = (rightIcon2 == null || (remoteIcon = rightIcon2.getRemoteIcon()) == null) ? null : new Q(remoteIcon.getImage(), remoteIcon.getSize());
        Context context3 = listItem.getContext();
        BeduinListItemModel.Icon.Right rightIcon3 = beduinListItemModel.getRightIcon();
        LocalIcon localIcon2 = rightIcon3 != null ? rightIcon3.getLocalIcon() : null;
        BeduinListItemModel.Icon.Right rightIcon4 = beduinListItemModel.getRightIcon();
        Drawable drawableC2 = v.c(context3, localIcon2, rightIcon4 != null ? rightIcon4.getBase64Icon() : null);
        SimpleDraweeView simpleDraweeView = listItem.f179509p;
        if (simpleDraweeView != null) {
            ListItem.e(simpleDraweeView, q12, drawableC);
        }
        SimpleDraweeView simpleDraweeView2 = listItem.f179510q;
        if (simpleDraweeView2 != null) {
            ListItem.e(simpleDraweeView2, q13, drawableC2);
        }
        listItem.b();
        listItem.c();
        final int i15 = 1;
        listItem.setRightIconClickedListener(new View.OnClickListener(this) { // from class: Rh.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.beduin.common.component.list_item.a f14559c;

            {
                this.f14559c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                List<BeduinAction> actions;
                List<BeduinAction> actions2;
                switch (i15) {
                    case 0:
                        com.avito.android.beduin.common.component.list_item.a aVar = this.f14559c;
                        BeduinListItemModel.Link link2 = aVar.f101697f.getLink();
                        if (link2 != null && (actions = link2.getActions()) != null) {
                            Iterator<T> it = actions.iterator();
                            while (it.hasNext()) {
                                aVar.f101696e.o((BeduinAction) it.next());
                            }
                            break;
                        }
                        break;
                    default:
                        com.avito.android.beduin.common.component.list_item.a aVar2 = this.f14559c;
                        BeduinListItemModel.Icon.Right rightIcon5 = aVar2.f101697f.getRightIcon();
                        if (rightIcon5 != null && (actions2 = rightIcon5.getActions()) != null) {
                            Iterator<T> it2 = actions2.iterator();
                            while (it2.hasNext()) {
                                aVar2.f101696e.o((BeduinAction) it2.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }
}
