package com.avito.android.lib.deprecated_design.select;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import hw.InterfaceC41179d;
import kotlin.Metadata;

/* compiled from: SelectionAwareEditText.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText$a;", "b", "Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText$a;", "getSelectionListener", "()Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText$a;", "setSelectionListener", "(Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText$a;)V", "selectionListener", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class SelectionAwareEditText extends AppCompatEditText {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public a selectionListener;

    /* compiled from: SelectionAwareEditText.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText$a;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();
    }

    public SelectionAwareEditText(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @l
    public final a getSelectionListener() {
        return this.selectionListener;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i12, int i13) {
        super.onSelectionChanged(i12, i13);
        a aVar = this.selectionListener;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void setSelectionListener(@l a aVar) {
        this.selectionListener = aVar;
    }
}
