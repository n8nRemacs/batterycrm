package com.avito.android.beduin.common.component.radio_group;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRadioListComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r extends N implements Y41.l<BeduinRadioGroupChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f102234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f102235m;

    /* compiled from: BeduinRadioListComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinRadioGroupChange.values().length];
            try {
                iArr[BeduinRadioGroupChange.f102183d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinRadioGroupChange.f102182c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinRadioGroupChange.f102184e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, LinearLayout linearLayout) {
        super(1);
        this.f102234l = jVar;
        this.f102235m = linearLayout;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinRadioGroupChange beduinRadioGroupChange) {
        Object next;
        int iOrdinal = beduinRadioGroupChange.ordinal();
        LinearLayout linearLayout = this.f102235m;
        j jVar = this.f102234l;
        if (iOrdinal == 0) {
            j.y(jVar, linearLayout, new q(jVar));
        } else if (iOrdinal == 1) {
            j.y(jVar, linearLayout, new p(jVar));
        } else if (iOrdinal == 2) {
            int i12 = j.f102217n;
            jVar.getClass();
            Iterator<View> it = new C22829k0(linearLayout).iterator();
            do {
                C22833m0 c22833m0 = (C22833m0) it;
                if (!c22833m0.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                next = c22833m0.next();
            } while (!L.f(((View) next).getTag(), "error_text_view"));
            I5.a((TextView) next, jVar.f102221i.getErrorMessageToDisplay(), false);
        }
        return G0.f406611a;
    }
}
