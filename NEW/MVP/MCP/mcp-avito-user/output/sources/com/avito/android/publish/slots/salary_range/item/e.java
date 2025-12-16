package com.avito.android.publish.slots.salary_range.item;

import Y41.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SalaryRangeItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/item/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/salary_range/item/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f244802b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f244803c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f244804d;

    public e(@Y61.k View view) {
        super(view);
        View viewFindViewById = this.itemView.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f244802b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.salary_from);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f244803c = (Input) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.salary_to);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f244804d = (Input) viewFindViewById3;
    }

    public static void B80(Input input, com.avito.android.publish.slots.salary_range.item.a aVar, l lVar) {
        String str = aVar.f244790e;
        if (str != null) {
            input.setPrefix(str);
        }
        String str2 = aVar.f244788c;
        if (str2 != null) {
            input.setPostfix(str2);
        }
        Integer num = aVar.f244789d;
        if (num != null) {
            input.setMaxLength(num.intValue());
        }
        String str3 = aVar.f244786a;
        if (str3 != null) {
            Input.t(input, str3, false, 6);
        }
        String str4 = aVar.f244787b;
        if (str4 != null) {
            input.setHint(str4);
        }
        input.b(new a(input, lVar));
    }

    @Override // com.avito.android.publish.slots.salary_range.item.d
    public final void Ja(@Y61.k c cVar) {
        String str = cVar.f244796c;
        ComponentContainer componentContainer = this.f244802b;
        componentContainer.setTitle(str);
        componentContainer.setSubtitle(cVar.f244798e);
        ItemWithState.State state = cVar.f244801h;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            ComponentContainer.n(componentContainer, ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            ComponentContainer.n(componentContainer, null, 3);
        }
    }

    @Override // com.avito.android.publish.slots.salary_range.item.d
    public final void Ln(@Y61.k com.avito.android.publish.slots.salary_range.item.a aVar, @Y61.k l<? super String, G0> lVar) {
        B80(this.f244803c, aVar, lVar);
    }

    @Override // com.avito.android.publish.slots.salary_range.item.d
    public final void tg(@Y61.k com.avito.android.publish.slots.salary_range.item.a aVar, @Y61.k l<? super String, G0> lVar) {
        B80(this.f244804d, aVar, lVar);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f244805b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f244806c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f244807d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Input input, l lVar) {
            this.f244806c = input;
            this.f244807d = (N) lVar;
            this.f244805b = input.getDeformattedText();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f244806c.getDeformattedText();
            if (L.f(deformattedText, this.f244805b)) {
                return;
            }
            this.f244807d.invoke(deformattedText);
            this.f244805b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
