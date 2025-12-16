package com.avito.android.publish.items.int_range;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.C35835l0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IntRangeItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/int_range/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/int_range/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f236983b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f236984c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f236985d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f236986e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Theme f236987f;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = this.itemView.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f236983b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.range_from);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f236984c = (Input) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.range_to);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f236985d = (Input) viewFindViewById3;
        this.f236986e = new LinkedHashMap();
    }

    public final void B80(Input input, com.avito.android.publish.items.int_range.a aVar, Y41.l<? super String, G0> lVar) {
        String string;
        String str = aVar.f236960b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        input.setPrefix(str);
        String str3 = aVar.f236961c;
        if (str3 == null) {
            str3 = "";
        }
        input.setHint(str3);
        input.setMaxLength(aVar.f236962d);
        com.avito.android.lib.design.component_container.a<View> aVarA = com.avito.android.lib.design.component_container.c.a(input);
        if (aVarA != null) {
            aVarA.setAutoResetCondition(aVar.f236963e);
        }
        if (input.f179340l.isFocused()) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f236986e;
        TextWatcher textWatcher = (TextWatcher) linkedHashMap.get(input);
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        Long l12 = aVar.f236959a;
        if (l12 != null && (string = l12.toString()) != null) {
            str2 = string;
        }
        Input.t(input, str2, false, 6);
        a aVar2 = new a(input, lVar);
        input.b(aVar2);
        linkedHashMap.put(input, aVar2);
    }

    @Override // com.avito.android.publish.items.int_range.k
    public final void JA(@Y61.k ItemWithState.State state) {
        boolean z12 = state instanceof ItemWithState.State.Error.ErrorWithMessage;
        ComponentContainer componentContainer = this.f236983b;
        if (z12) {
            ComponentContainer.n(componentContainer, ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, 2);
            return;
        }
        if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            ComponentContainer.n(componentContainer, null, 3);
        } else if (state instanceof ItemWithState.State.Normal) {
            componentContainer.q(((ItemWithState.State.Normal) state).f173899b);
        } else {
            componentContainer.k();
        }
    }

    @Override // com.avito.android.publish.items.int_range.k
    public final void YW(@Y61.k com.avito.android.publish.items.int_range.a aVar, @Y61.k Y41.l<? super String, G0> lVar) {
        B80(this.f236985d, aVar, lVar);
    }

    @Override // com.avito.android.publish.items.int_range.k
    public final void aS(@Y61.k Theme theme) throws Resources.NotFoundException {
        if (this.f236987f == theme || !Theme.INSTANCE.isAvitoRe23(theme)) {
            return;
        }
        int iJ2 = C35835l0.j(R.attr.inputDefaultM, new ContextThemeWrapper(this.itemView.getContext(), R.style.Theme_DesignSystem_Re23));
        Input input = this.f236984c;
        input.setAppearance(iJ2);
        Input input2 = this.f236985d;
        input2.setAppearance(iJ2);
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.a.c());
        input2.setFormatterType(FormatterType.a.c());
        this.f236987f = theme;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        LinkedHashMap linkedHashMap = this.f236986e;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Input) entry.getKey()).h((TextWatcher) entry.getValue());
        }
        linkedHashMap.clear();
    }

    @Override // com.avito.android.publish.items.int_range.k
    public final void mg(@Y61.k com.avito.android.publish.items.int_range.a aVar, @Y61.k Y41.l<? super String, G0> lVar) {
        B80(this.f236984c, aVar, lVar);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f236988b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f236989c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f236990d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Input input, Y41.l lVar) {
            this.f236989c = input;
            this.f236990d = (N) lVar;
            this.f236988b = input.getDeformattedText();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f236989c.getDeformattedText();
            if (L.f(deformattedText, this.f236988b)) {
                return;
            }
            this.f236990d.invoke(deformattedText);
            this.f236988b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
