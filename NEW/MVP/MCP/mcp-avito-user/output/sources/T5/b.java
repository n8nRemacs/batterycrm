package T5;

import Y61.k;
import Y61.l;
import android.text.Editable;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.AbstractC35956u5;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LeasingInputView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT5/b;", "LT5/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements T5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ComponentContainer f15351a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f15352b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public N f15353c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f15354d = new a();

    /* compiled from: LeasingInputView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"T5/b$a", "Lcom/avito/android/util/u5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC35956u5 {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void afterTextChanged(@k Editable editable) {
            ?? r02 = b.this.f15353c;
            if (r02 != 0) {
                r02.invoke(editable.toString());
            }
        }
    }

    public b(@k ComponentContainer componentContainer, @k Input input) {
        this.f15351a = componentContainer;
        this.f15352b = input;
    }

    public final void a(@l String str) {
        ComponentContainer.l(this.f15351a, new int[]{this.f15352b.getId()}, str, 4);
    }

    public final void b() {
        this.f15352b.h(this.f15354d);
    }
}
