package com.avito.android.edit_basic_info;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.edit_basic_info.EditBasicInfoFragment;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.M;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ky.InterfaceC43512a;

/* compiled from: EditBasicInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/o;", "Lcom/avito/android/edit_basic_info/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f146177a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f146178b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f146179c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EditBasicInfoArguments f146180d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC43512a, G0> f146181e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f146182f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f146183g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f146184h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f146185i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f146186j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f146187k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Input f146188l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f146189m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Input f146190n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Input f146191o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f146192p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f146193q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Input f146194r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.d f146195s;

    /* compiled from: EditBasicInfoView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lky/a;", "it", "Lkotlin/G0;", "invoke", "(Lky/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC43512a, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC43512a interfaceC43512a) {
            o.this.f146181e.invoke(interfaceC43512a);
            return G0.f406611a;
        }
    }

    /* compiled from: EditBasicInfoView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            o.this.f146181e.invoke(InterfaceC43512a.b.f413300a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k View view, @Y61.k h hVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k EditBasicInfoArguments editBasicInfoArguments, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.l<? super InterfaceC43512a, G0> lVar) {
        int i12;
        Drawable drawableH;
        TextView textView;
        String hint;
        this.f146177a = view;
        this.f146178b = hVar;
        this.f146179c = screenPerformanceTracker;
        this.f146180d = editBasicInfoArguments;
        this.f146181e = lVar;
        View viewFindViewById = view.findViewById(R.id.basic_info_editor_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.basic_info_editor_avatar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
        this.f146182f = simpleDraweeView;
        View viewFindViewById3 = view.findViewById(R.id.basic_info_editor_avatar_spinner);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f146183g = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.basic_info_editor_avatar_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f146184h = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.basic_info_editor_avatar_moderation_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f146185i = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.basic_info_editor_name_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.basic_info_editor_name_subtitle);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.basic_info_editor_name_input);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById8;
        this.f146186j = input;
        View viewFindViewById9 = view.findViewById(R.id.basic_info_editor_name_hint);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146187k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.basic_info_editor_vertical_title);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.basic_info_editor_vertical_name);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById11;
        this.f146188l = input2;
        View viewFindViewById12 = view.findViewById(R.id.basic_info_editor_vertical_hint);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView5 = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.basic_info_editor_specific_title);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView6 = (TextView) viewFindViewById13;
        this.f146189m = textView6;
        View viewFindViewById14 = view.findViewById(R.id.basic_info_editor_specific_name);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input3 = (Input) viewFindViewById14;
        this.f146190n = input3;
        View viewFindViewById15 = view.findViewById(R.id.basic_info_editor_personal_link_title);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView7 = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.basic_info_editor_personal_link_subtitle);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView8 = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.basic_info_editor_personal_link_input);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input4 = (Input) viewFindViewById17;
        this.f146191o = input4;
        View viewFindViewById18 = view.findViewById(R.id.basic_info_editor_personal_link_hint);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView9 = (TextView) viewFindViewById18;
        this.f146192p = textView9;
        View viewFindViewById19 = view.findViewById(R.id.basic_info_editor_action_button);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById19;
        this.f146193q = button;
        TextView textView10 = (TextView) view.findViewById(R.id.basic_info_editor_seller_type_title);
        Input input5 = (Input) view.findViewById(R.id.basic_info_editor_seller_type_select);
        this.f146194r = input5;
        this.f146195s = new com.avito.android.extended_profile_ui_components.d(view.getContext(), com.avito.android.actions_sheet.a.d(view, R.dimen.extended_profile_settings_horizontal_margin), aVar, new a(), new b());
        final int i13 = 0;
        simpleDraweeView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_basic_info.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146176c;

            {
                this.f146176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.f.f413304a);
                        break;
                    case 1:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.e.f413303a);
                        break;
                    case 2:
                        this.f146176c.f146178b.b();
                        break;
                    case 3:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.h.f413306a);
                        break;
                    case 4:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.i.f413307a);
                        break;
                    default:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.k.f413309a);
                        break;
                }
            }
        });
        BasicInfoV2Item basicInfoV2Item = editBasicInfoArguments.f146101b;
        I5.a(textView2, basicInfoV2Item.f229219o.getName().getTitle(), false);
        BasicInfoV2Widget.EditorConfig editorConfig = basicInfoV2Item.f229219o;
        I5.a(textView3, editorConfig.getName().getSubtitle(), false);
        com.avito.android.lib.design.input.n.c(input, new p(this));
        BasicInfoV2Widget.EditorVerticalConfig vertical = editorConfig.getVertical();
        I5.a(textView4, vertical != null ? vertical.getTitle() : null, false);
        BasicInfoV2Widget.EditorVerticalConfig vertical2 = editorConfig.getVertical();
        I5.a(textView5, vertical2 != null ? vertical2.getHint() : null, false);
        M.a(input2, editorConfig.getVertical() != null);
        final int i14 = 4;
        input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_basic_info.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146176c;

            {
                this.f146176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.f.f413304a);
                        break;
                    case 1:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.e.f413303a);
                        break;
                    case 2:
                        this.f146176c.f146178b.b();
                        break;
                    case 3:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.h.f413306a);
                        break;
                    case 4:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.i.f413307a);
                        break;
                    default:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.k.f413309a);
                        break;
                }
            }
        });
        BasicInfoV2Widget.EditorVerticalConfig vertical3 = editorConfig.getVertical();
        if (vertical3 == null || !vertical3.isEditable()) {
            input2.setEnabled(false);
            input2.setRightIcon(R.drawable.ic_basic_info_edit_vertical_edit_lock);
        } else {
            input2.setEnabled(true);
            input2.setRightIcon(C35835l0.h(R.attr.ic_arrowRight20, input2.getContext()));
        }
        BasicInfoV2Widget.EditorSpecificConfig specific = editorConfig.getSpecific();
        I5.a(textView6, specific != null ? specific.getTitle() : null, false);
        input3.setRightIcon(C35835l0.h(R.attr.ic_arrowRight20, input3.getContext()));
        final int i15 = 3;
        input3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_basic_info.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146176c;

            {
                this.f146176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.f.f413304a);
                        break;
                    case 1:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.e.f413303a);
                        break;
                    case 2:
                        this.f146176c.f146178b.b();
                        break;
                    case 3:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.h.f413306a);
                        break;
                    case 4:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.i.f413307a);
                        break;
                    default:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.k.f413309a);
                        break;
                }
            }
        });
        BasicInfoV2Widget.ServicesSellerTypeConfig sellerType = editorConfig.getSellerType();
        if (sellerType == null) {
            D6.w(textView10);
            D6.w(input5);
        } else {
            ((EditBasicInfoFragment.f) lVar).invoke(InterfaceC43512a.l.f413310a);
            D6.H(textView10);
            D6.H(input5);
            I5.a(textView10, sellerType.getTitle(), false);
            BasicInfoV2Widget.Icon icon = sellerType.getIcon();
            if (icon != null) {
                textView10.setCompoundDrawablePadding(y6.b(4));
                Integer numA = com.avito.android.lib.util.q.a(icon.getIconName());
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    Context context = textView10.getContext();
                    if (context != null && (drawableH = C35835l0.h(iIntValue, context)) != null) {
                        Integer numA2 = com.avito.android.lib.util.e.a(icon.getColor());
                        if (numA2 != null) {
                            drawableH.setTint(numA2.intValue());
                        }
                        I5.d(textView10, null, drawableH, 11);
                    }
                }
            }
            boolean zIsEditable = sellerType.isEditable();
            if (zIsEditable) {
                i12 = R.attr.ic_arrowDown20;
            } else {
                if (zIsEditable) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.ic_lock20;
            }
            input5.setRightIcon(C35835l0.h(i12, input3.getContext()));
            input5.setEnabled(sellerType.isEditable());
            final int i16 = 5;
            input5.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_basic_info.n

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o f146176c;

                {
                    this.f146176c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            this.f146176c.f146181e.invoke(InterfaceC43512a.f.f413304a);
                            break;
                        case 1:
                            this.f146176c.f146181e.invoke(InterfaceC43512a.e.f413303a);
                            break;
                        case 2:
                            this.f146176c.f146178b.b();
                            break;
                        case 3:
                            this.f146176c.f146181e.invoke(InterfaceC43512a.h.f413306a);
                            break;
                        case 4:
                            this.f146176c.f146181e.invoke(InterfaceC43512a.i.f413307a);
                            break;
                        default:
                            this.f146176c.f146181e.invoke(InterfaceC43512a.k.f413309a);
                            break;
                    }
                }
            });
        }
        BasicInfoV2Widget.EditorPersonalLinkConfig personalLink = editorConfig.getPersonalLink();
        I5.a(textView7, personalLink != null ? personalLink.getTitle() : null, false);
        BasicInfoV2Widget.EditorPersonalLinkConfig personalLink2 = editorConfig.getPersonalLink();
        I5.a(textView8, personalLink2 != null ? personalLink2.getSubtitle() : null, false);
        BasicInfoV2Widget.EditorPersonalLinkConfig personalLink3 = editorConfig.getPersonalLink();
        if (personalLink3 != null) {
            hint = personalLink3.getHint();
            textView = textView9;
        } else {
            textView = textView9;
            hint = null;
        }
        I5.a(textView, hint, false);
        BasicInfoV2Widget.EditorPersonalLinkConfig personalLink4 = editorConfig.getPersonalLink();
        if (personalLink4 == null) {
            D6.w(input4);
        } else {
            D6.H(input4);
            FormatterType.f179288e.getClass();
            input4.setFormatterType(FormatterType.a(FormatterType.f179289f, new MaskParameters(personalLink4.getPrefix(), false, null, "", false, null, false, null, (char) 0, 0, null, 2038, null)));
            input4.setHint(personalLink4.getPrefix());
            input4.setMaxLength(personalLink4.getMaxLengthCount());
            BasicInfoV2Item.PersonalLink personalLink5 = basicInfoV2Item.f229216l;
            String str = personalLink5 != null ? personalLink5.f229231b : null;
            Input.t(input4, str == null ? "" : str, false, 6);
            input4.setSelection(0);
            input4.b(new q(input4, this));
        }
        com.avito.android.lib.design.button.b.a(button, editorConfig.getActionButton().getTitle(), false);
        final int i17 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_basic_info.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146176c;

            {
                this.f146176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.f.f413304a);
                        break;
                    case 1:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.e.f413303a);
                        break;
                    case 2:
                        this.f146176c.f146178b.b();
                        break;
                    case 3:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.h.f413306a);
                        break;
                    case 4:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.i.f413307a);
                        break;
                    default:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.k.f413309a);
                        break;
                }
            }
        });
        final int i18 = 2;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_basic_info.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146176c;

            {
                this.f146176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.f.f413304a);
                        break;
                    case 1:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.e.f413303a);
                        break;
                    case 2:
                        this.f146176c.f146178b.b();
                        break;
                    case 3:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.h.f413306a);
                        break;
                    case 4:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.i.f413307a);
                        break;
                    default:
                        this.f146176c.f146181e.invoke(InterfaceC43512a.k.f413309a);
                        break;
                }
            }
        });
    }
}
