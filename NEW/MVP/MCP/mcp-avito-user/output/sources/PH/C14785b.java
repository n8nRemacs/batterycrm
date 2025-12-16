package Ph;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.avito.android.beduin.common.component.label.joiner.token_mapper.s;
import com.avito.android.beduin.network.model.LabelTextAttributes;
import com.avito.android.beduin.network.model.LabelToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LabelTokenJoiner.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPh/b;", "LPh/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ph.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14785b implements InterfaceC14784a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f13233a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<Class<?>, s<?>> f13234b;

    @Inject
    public C14785b(@k f fVar, @k Map<Class<?>, s<?>> map) {
        this.f13233a = fVar;
        this.f13234b = map;
    }

    @Override // Ph.InterfaceC14784a
    @k
    public final SpannableStringBuilder a(@k Context context, @k List<? extends LabelToken> list, @l String str, @l LabelTextAttributes labelTextAttributes) {
        CharSequence charSequenceA;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        for (LabelToken labelToken : list) {
            s<?> sVar = this.f13234b.get(labelToken.getClass());
            SpannableStringBuilder spannableStringBuilder2 = null;
            s<?> sVar2 = sVar instanceof s ? sVar : null;
            if (sVar2 != null && (charSequenceA = sVar2.a(context, labelToken)) != null) {
                ArrayList arrayListA = this.f13233a.a(context, labelTextAttributes, labelToken.getOverridenAttributes());
                spannableStringBuilder2 = new SpannableStringBuilder(charSequenceA);
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    spannableStringBuilder2.setSpan(it.next(), 0, spannableStringBuilder2.length(), 33);
                }
            }
            if (spannableStringBuilder2 != null) {
                arrayList.add(spannableStringBuilder2);
            }
        }
        if (str == null) {
            str = " ";
        }
        C42745f0.N(arrayList, spannableStringBuilder, str, null, null, null, 124);
        return spannableStringBuilder;
    }
}
