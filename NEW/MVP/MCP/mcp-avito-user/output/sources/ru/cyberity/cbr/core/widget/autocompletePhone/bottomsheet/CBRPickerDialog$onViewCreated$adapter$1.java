package ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet;

import Y41.l;
import Y61.k;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;

/* compiled from: CBRPickerDialog.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog;", "parentView", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRPickerDialog$onViewCreated$adapter$1 extends N implements l<ViewGroup, CBRPickerDialog.PickerItemViewHolder> {
    final /* synthetic */ CBRPickerDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRPickerDialog$onViewCreated$adapter$1(CBRPickerDialog cBRPickerDialog) {
        super(1);
        this.this$0 = cBRPickerDialog;
    }

    @Override // Y41.l
    @k
    public final CBRPickerDialog.PickerItemViewHolder invoke(@k ViewGroup viewGroup) {
        return this.this$0.createItemViewHolder(viewGroup);
    }
}
