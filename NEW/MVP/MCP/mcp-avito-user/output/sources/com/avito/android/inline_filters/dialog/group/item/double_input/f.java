package com.avito.android.inline_filters.dialog.group.item.double_input;

import Y41.q;
import Y61.k;
import Y61.l;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.R;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.input.s;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DoubleInputView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/double_input/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/group/item/double_input/c;", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements com.avito.android.inline_filters.dialog.group.item.double_input.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f171587h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f171588b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f171589c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public N f171590d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public N f171591e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public s f171592f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public s f171593g;

    /* compiled from: DoubleInputView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/double_input/f$a;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f171594a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f171595b;

        public a(@k String str) {
            List listF0 = C43066x.f0(str, new String[]{"%s"}, 0, 6);
            if (listF0.size() != 2) {
                this.f171594a = "";
                this.f171595b = "";
            } else {
                this.f171594a = (String) listF0.get(0);
                this.f171595b = (String) listF0.get(1);
            }
        }
    }

    /* compiled from: DoubleInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DoubleInputItem f171597m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DoubleInputItem doubleInputItem) {
            super(1);
            this.f171597m = doubleInputItem;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            f fVar = f.this;
            fVar.f171590d.invoke(this.f171597m.f171575c, f.B80(fVar, fVar.f171589c), f.B80(fVar, fVar.f171588b));
            return G0.f406611a;
        }
    }

    /* compiled from: DoubleInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DoubleInputItem f171599m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DoubleInputItem doubleInputItem) {
            super(1);
            this.f171599m = doubleInputItem;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            f fVar = f.this;
            fVar.f171590d.invoke(this.f171599m.f171575c, f.B80(fVar, fVar.f171589c), f.B80(fVar, fVar.f171588b));
            return G0.f406611a;
        }
    }

    /* compiled from: DoubleInputView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f171600l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DoubleInputView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Ljava/lang/Long;Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements q<Filter, Long, Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f171601l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ G0 invoke(Filter filter, Long l12, Long l13) {
            return G0.f406611a;
        }
    }

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.inline_filter_to_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f171588b = input;
        View viewFindViewById2 = view.findViewById(R.id.inline_filter_from_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById2;
        this.f171589c = input2;
        this.f171590d = e.f171601l;
        this.f171591e = d.f171600l;
        final int i12 = 0;
        input2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.avito.android.inline_filters.dialog.group.item.double_input.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f171584c;

            {
                this.f171584c = this;
            }

            /* JADX WARN: Type inference failed for: r3v4, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                f fVar = this.f171584c;
                switch (i12) {
                    case 0:
                        if (i13 != 5) {
                            int i14 = f.f171587h;
                            break;
                        } else {
                            fVar.f171588b.v();
                            break;
                        }
                    default:
                        if (i13 != 6) {
                            int i15 = f.f171587h;
                            break;
                        } else {
                            fVar.f171591e.invoke();
                            break;
                        }
                }
                return false;
            }
        });
        final int i13 = 1;
        input.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.avito.android.inline_filters.dialog.group.item.double_input.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f171584c;

            {
                this.f171584c = this;
            }

            /* JADX WARN: Type inference failed for: r3v4, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i132, KeyEvent keyEvent) {
                f fVar = this.f171584c;
                switch (i13) {
                    case 0:
                        if (i132 != 5) {
                            int i14 = f.f171587h;
                            break;
                        } else {
                            fVar.f171588b.v();
                            break;
                        }
                    default:
                        if (i132 != 6) {
                            int i15 = f.f171587h;
                            break;
                        } else {
                            fVar.f171591e.invoke();
                            break;
                        }
                }
                return false;
            }
        });
    }

    public static final Long B80(f fVar, Input input) {
        fVar.getClass();
        String deformattedText = input.getDeformattedText();
        StringBuilder sb2 = new StringBuilder();
        int length = deformattedText.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = deformattedText.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return C43066x.z0(sb2.toString());
    }

    @Override // com.avito.android.inline_filters.dialog.group.item.double_input.c
    public final void SN(@k DoubleInputItem doubleInputItem) {
        String thousandsSeparator;
        String fromValueFormat;
        Filter.Config config;
        Filter.Config config2;
        String toValueFormat;
        Filter filter = doubleInputItem.f171575c;
        Filter.Widget widget = filter.getWidget();
        String toPlaceholder = null;
        Filter.Config config3 = widget != null ? widget.getConfig() : null;
        if (config3 == null || (thousandsSeparator = config3.getThousandsSeparator()) == null) {
            thousandsSeparator = "";
        }
        StringBuilder sbB = C23088b.b("###", thousandsSeparator, "###", thousandsSeparator, "###");
        m.p(sbB, thousandsSeparator, "###", thousandsSeparator, "###");
        FormatterType formatterType = new FormatterType(1, 2, new MaskParameters("", false, "", null, false, G.h(sbB, thousandsSeparator, "###", thousandsSeparator, "###"), true, "0", (char) 0, 0, null, 1818, null));
        String str = "%s";
        if (config3 == null || (fromValueFormat = config3.getFromValueFormat()) == null) {
            fromValueFormat = "%s";
        }
        a aVar = new a(fromValueFormat);
        String str2 = aVar.f171594a;
        Input input = this.f171589c;
        input.setPrefix(str2);
        input.setPostfix(aVar.f171595b);
        input.setFormatterType(formatterType);
        if (config3 != null && (toValueFormat = config3.getToValueFormat()) != null) {
            str = toValueFormat;
        }
        a aVar2 = new a(str);
        String str3 = aVar2.f171594a;
        Input input2 = this.f171588b;
        input2.setPrefix(str3);
        input2.setPostfix(aVar2.f171595b);
        input2.setFormatterType(formatterType);
        s sVar = this.f171593g;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f171593g = n.c(input, new b(doubleInputItem));
        s sVar2 = this.f171592f;
        if (sVar2 != null) {
            input2.h(sVar2);
        }
        this.f171592f = n.c(input2, new c(doubleInputItem));
        InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = doubleInputItem.f171576d;
        Long from = inlineFilterNumericRangeValue != null ? inlineFilterNumericRangeValue.getFrom() : null;
        Filter.Widget widget2 = filter.getWidget();
        String fromPlaceholder = (widget2 == null || (config2 = widget2.getConfig()) == null) ? null : config2.getFromPlaceholder();
        if (from == null) {
            input.setHint(fromPlaceholder);
        } else {
            Input.t(input, from.toString(), false, 6);
        }
        Long to2 = inlineFilterNumericRangeValue != null ? inlineFilterNumericRangeValue.getTo() : null;
        Filter.Widget widget3 = filter.getWidget();
        if (widget3 != null && (config = widget3.getConfig()) != null) {
            toPlaceholder = config.getToPlaceholder();
        }
        if (to2 == null) {
            input2.setHint(toPlaceholder);
        } else {
            Input.t(input2, to2.toString(), false, 6);
        }
        if (doubleInputItem.f171577e) {
            input.postDelayed(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 0), 300L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.dialog.group.item.double_input.c
    public final void aW(@k Y41.a<G0> aVar) {
        this.f171591e = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.dialog.group.item.double_input.c
    public final void g80(@k q<? super Filter, ? super Long, ? super Long, G0> qVar) {
        this.f171590d = (N) qVar;
    }
}
