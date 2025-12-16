package com.avito.android.beduin.common.container.checkbox_group;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.view.C22829k0;
import com.avito.android.lib.design.toggle.Checkbox;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: BeduinCheckboxGroupView.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/i;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/beduin/common/container/checkbox_group/i$a;", "listener", "Lkotlin/G0;", "setCheckedListener", "(Lcom/avito/android/beduin/common/container/checkbox_group/i$a;)V", "", "", "selectedIds", "setChecked", "(Ljava/util/List;)V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f102987b;

    /* compiled from: BeduinCheckboxGroupView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/i$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k String str, boolean z12);
    }

    /* compiled from: BeduinCheckboxGroupView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/g;", "view", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/container/checkbox_group/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set<String> f102988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set) {
            super(1);
            this.f102988l = set;
        }

        @Override // Y41.l
        public final G0 invoke(g gVar) {
            g gVar2 = gVar;
            String optionId = gVar2.getOptionId();
            if (optionId != null) {
                boolean zContains = this.f102988l.contains(optionId);
                Checkbox checkbox = gVar2.f102980b;
                if (zContains && !checkbox.isChecked()) {
                    gVar2.setChecked(true);
                } else if (!zContains && checkbox.isChecked()) {
                    gVar2.setChecked(false);
                }
            }
            return G0.f406611a;
        }
    }

    public i(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setChecked(@Y61.k List<String> selectedIds) {
        b bVar = new b(C42745f0.P0(selectedIds));
        C43025h.a aVar = new C43025h.a(C43033p.i(new C22829k0(this), k.f102990l));
        while (aVar.hasNext()) {
            bVar.invoke(aVar.next());
        }
    }

    public final void setCheckedListener(@Y61.l a listener) {
        this.f102987b = listener;
    }
}
