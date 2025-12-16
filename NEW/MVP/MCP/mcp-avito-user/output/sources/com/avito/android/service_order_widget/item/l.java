package com.avito.android.service_order_widget.item;

import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrderWidgetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/l;", "Lcom/avito/android/service_order_widget/item/j;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f278928l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f278929b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f278930c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f278931d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f278932e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f278933f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f278934g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Button f278935h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f278936i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Button f278937j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public y f278938k;

    /* compiled from: ServiceOrderWidgetItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_order_widget/item/l$a;", "", "<init>", "()V", "", "DESCRIPTION_BUTTON_NAME", "Ljava/lang/String;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public l(@Y61.k View view, boolean z12) {
        super(view);
        this.f278929b = view;
        this.f278930c = z12;
        this.f278931d = (TextView) view.findViewById(R.id.service_order_widget_title);
        this.f278932e = (TextView) view.findViewById(R.id.service_order_widget_description);
        this.f278933f = (Button) view.findViewById(R.id.service_order_widget_primary_button);
        this.f278934g = (Button) view.findViewById(R.id.service_order_widget_secondary_button);
        this.f278935h = (Button) view.findViewById(R.id.service_order_widget_short_primary_button);
        this.f278936i = (SimpleDraweeView) view.findViewById(R.id.service_order_widget_image);
        this.f278937j = (Button) view.findViewById(R.id.service_order_widget_short_secondary_button);
    }

    @Override // com.avito.android.service_order_widget.item.delegate.b
    public final void Pn(com.avito.android.service_order_widget.item.delegate.a aVar, final com.avito.android.service_order_widget.item.delegate.d dVar) {
        AttributedText attributedTextCopy$default;
        z<DeepLink> zVarLinkClicksV3;
        final com.avito.android.service_order_widget.item.a aVar2 = (com.avito.android.service_order_widget.item.a) aVar;
        boolean z12 = false;
        I5.a(this.f278931d, aVar2.f278844c, false);
        AttributedText attributedText = aVar2.f278847f;
        if (attributedText != null) {
            List<Attribute> attributes = attributedText.getAttributes();
            ArrayList arrayList = new ArrayList(C42745f0.q(attributes, 10));
            for (Parcelable parcelableCopy$default : attributes) {
                boolean z13 = parcelableCopy$default instanceof DeepLinkAttribute;
                List parameters = z13 ? ((DeepLinkAttribute) parcelableCopy$default).getParameters() : parcelableCopy$default instanceof LinkAttribute ? ((LinkAttribute) parcelableCopy$default).getParameters() : C42784z0.f406748b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(parameters != null ? parameters : C42784z0.f406748b);
                arrayList2.add(FontParameter.UnderlineParameter.INSTANCE);
                if (z13) {
                    parcelableCopy$default = DeepLinkAttribute.copy$default((DeepLinkAttribute) parcelableCopy$default, null, null, null, null, null, arrayList2, 31, null);
                } else if (parcelableCopy$default instanceof LinkAttribute) {
                    parcelableCopy$default = LinkAttribute.copy$default((LinkAttribute) parcelableCopy$default, null, null, null, arrayList2, 7, null);
                }
                arrayList.add(parcelableCopy$default);
            }
            attributedTextCopy$default = AttributedText.copy$default(attributedText, null, arrayList, 1, 1, null);
        } else {
            attributedTextCopy$default = null;
        }
        TextView textView = this.f278932e;
        com.avito.android.util.text.j.a(textView, attributedTextCopy$default, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        y yVar = this.f278938k;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f278938k = (y) ((attributedTextCopy$default == null || (zVarLinkClicksV3 = attributedTextCopy$default.linkClicksV3()) == null) ? null : zVarLinkClicksV3.t0(new m(dVar)));
        boolean z14 = this.f278930c;
        Button button = this.f278937j;
        Button button2 = this.f278934g;
        Button button3 = this.f278935h;
        Button button4 = this.f278933f;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = aVar2.f278846e;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2 = aVar2.f278845d;
        UniversalImage universalImage = aVar2.f278848g;
        if (universalImage == null || !z14) {
            D6.w(button3);
            D6.G(button4, true);
            com.avito.android.lib.design.button.b.a(button4, serviceOrderWidgetAction2 != null ? serviceOrderWidgetAction2.getTitle() : null, false);
            final int i12 = 2;
            button4.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_order_widget.item.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.avito.android.service_order_widget.item.delegate.d dVar2 = dVar;
                    a aVar3 = aVar2;
                    switch (i12) {
                        case 0:
                            int i13 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction3 = aVar3.f278845d;
                            if (serviceOrderWidgetAction3 != null) {
                                dVar2.k(serviceOrderWidgetAction3.getUri(), serviceOrderWidgetAction3.getTitle());
                                break;
                            }
                            break;
                        case 1:
                            int i14 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction4 = aVar3.f278846e;
                            if ((serviceOrderWidgetAction4 != null ? serviceOrderWidgetAction4.getUri() : null) != null) {
                                dVar2.k(serviceOrderWidgetAction4.getUri(), serviceOrderWidgetAction4.getTitle());
                                break;
                            }
                            break;
                        case 2:
                            int i15 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction5 = aVar3.f278845d;
                            if (serviceOrderWidgetAction5 != null) {
                                dVar2.k(serviceOrderWidgetAction5.getUri(), serviceOrderWidgetAction5.getTitle());
                                break;
                            }
                            break;
                        default:
                            int i16 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction6 = aVar3.f278846e;
                            if ((serviceOrderWidgetAction6 != null ? serviceOrderWidgetAction6.getUri() : null) != null) {
                                dVar2.k(serviceOrderWidgetAction6.getUri(), serviceOrderWidgetAction6.getTitle());
                                break;
                            }
                            break;
                    }
                }
            });
            D6.w(button);
            D6.G(button2, true);
            com.avito.android.lib.design.button.b.a(button2, serviceOrderWidgetAction != null ? serviceOrderWidgetAction.getTitle() : null, false);
            final int i13 = 3;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_order_widget.item.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.avito.android.service_order_widget.item.delegate.d dVar2 = dVar;
                    a aVar3 = aVar2;
                    switch (i13) {
                        case 0:
                            int i132 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction3 = aVar3.f278845d;
                            if (serviceOrderWidgetAction3 != null) {
                                dVar2.k(serviceOrderWidgetAction3.getUri(), serviceOrderWidgetAction3.getTitle());
                                break;
                            }
                            break;
                        case 1:
                            int i14 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction4 = aVar3.f278846e;
                            if ((serviceOrderWidgetAction4 != null ? serviceOrderWidgetAction4.getUri() : null) != null) {
                                dVar2.k(serviceOrderWidgetAction4.getUri(), serviceOrderWidgetAction4.getTitle());
                                break;
                            }
                            break;
                        case 2:
                            int i15 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction5 = aVar3.f278845d;
                            if (serviceOrderWidgetAction5 != null) {
                                dVar2.k(serviceOrderWidgetAction5.getUri(), serviceOrderWidgetAction5.getTitle());
                                break;
                            }
                            break;
                        default:
                            int i16 = l.f278928l;
                            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction6 = aVar3.f278846e;
                            if ((serviceOrderWidgetAction6 != null ? serviceOrderWidgetAction6.getUri() : null) != null) {
                                dVar2.k(serviceOrderWidgetAction6.getUri(), serviceOrderWidgetAction6.getTitle());
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            D6.w(button4);
            D6.G(button3, true);
            if (button3 != null) {
                com.avito.android.lib.design.button.b.a(button3, serviceOrderWidgetAction2 != null ? serviceOrderWidgetAction2.getTitle() : null, false);
            }
            if (button3 != null) {
                final int i14 = 0;
                button3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_order_widget.item.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.avito.android.service_order_widget.item.delegate.d dVar2 = dVar;
                        a aVar3 = aVar2;
                        switch (i14) {
                            case 0:
                                int i132 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction3 = aVar3.f278845d;
                                if (serviceOrderWidgetAction3 != null) {
                                    dVar2.k(serviceOrderWidgetAction3.getUri(), serviceOrderWidgetAction3.getTitle());
                                    break;
                                }
                                break;
                            case 1:
                                int i142 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction4 = aVar3.f278846e;
                                if ((serviceOrderWidgetAction4 != null ? serviceOrderWidgetAction4.getUri() : null) != null) {
                                    dVar2.k(serviceOrderWidgetAction4.getUri(), serviceOrderWidgetAction4.getTitle());
                                    break;
                                }
                                break;
                            case 2:
                                int i15 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction5 = aVar3.f278845d;
                                if (serviceOrderWidgetAction5 != null) {
                                    dVar2.k(serviceOrderWidgetAction5.getUri(), serviceOrderWidgetAction5.getTitle());
                                    break;
                                }
                                break;
                            default:
                                int i16 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction6 = aVar3.f278846e;
                                if ((serviceOrderWidgetAction6 != null ? serviceOrderWidgetAction6.getUri() : null) != null) {
                                    dVar2.k(serviceOrderWidgetAction6.getUri(), serviceOrderWidgetAction6.getTitle());
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            D6.w(button2);
            D6.G(button, true);
            if (button != null) {
                com.avito.android.lib.design.button.b.a(button, serviceOrderWidgetAction != null ? serviceOrderWidgetAction.getTitle() : null, false);
            }
            if (button != null) {
                final int i15 = 1;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.service_order_widget.item.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.avito.android.service_order_widget.item.delegate.d dVar2 = dVar;
                        a aVar3 = aVar2;
                        switch (i15) {
                            case 0:
                                int i132 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction3 = aVar3.f278845d;
                                if (serviceOrderWidgetAction3 != null) {
                                    dVar2.k(serviceOrderWidgetAction3.getUri(), serviceOrderWidgetAction3.getTitle());
                                    break;
                                }
                                break;
                            case 1:
                                int i142 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction4 = aVar3.f278846e;
                                if ((serviceOrderWidgetAction4 != null ? serviceOrderWidgetAction4.getUri() : null) != null) {
                                    dVar2.k(serviceOrderWidgetAction4.getUri(), serviceOrderWidgetAction4.getTitle());
                                    break;
                                }
                                break;
                            case 2:
                                int i152 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction5 = aVar3.f278845d;
                                if (serviceOrderWidgetAction5 != null) {
                                    dVar2.k(serviceOrderWidgetAction5.getUri(), serviceOrderWidgetAction5.getTitle());
                                    break;
                                }
                                break;
                            default:
                                int i16 = l.f278928l;
                                ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction6 = aVar3.f278846e;
                                if ((serviceOrderWidgetAction6 != null ? serviceOrderWidgetAction6.getUri() : null) != null) {
                                    dVar2.k(serviceOrderWidgetAction6.getUri(), serviceOrderWidgetAction6.getTitle());
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        if (universalImage != null && z14) {
            z12 = true;
        }
        SimpleDraweeView simpleDraweeView = this.f278936i;
        D6.G(simpleDraweeView, z12);
        if (!z14 || simpleDraweeView == null) {
            return;
        }
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(universalImage != null ? com.avito.android.actions_sheet.a.q(this.f278929b, universalImage) : null), null, null, null, 14);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f278933f.setOnClickListener(null);
        this.f278934g.setOnClickListener(null);
        Button button = this.f278935h;
        if (button != null) {
            button.setOnClickListener(null);
        }
        Button button2 = this.f278937j;
        if (button2 != null) {
            button2.setOnClickListener(null);
        }
    }
}
