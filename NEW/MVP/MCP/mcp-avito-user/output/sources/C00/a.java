package C00;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PersonFormItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LC00/a;", "Lcom/avito/konveyor/adapter/b;", "LC00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class a extends com.avito.konveyor.adapter.b implements c {
    @Override // C00.c
    public void setEnabled(boolean z12) {
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
            this.itemView.setEnabled(false);
        }
    }
}
