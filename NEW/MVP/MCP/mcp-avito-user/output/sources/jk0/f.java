package JK0;

import JK0.e;
import Y61.k;
import com.avito.android.util.text.formatter_rules.UnsupportedAttributedTextVersionException;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FormatterRuleFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJK0/f;", "LJK0/e;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<Integer, d> f8878a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e.a f8879b;

    @Inject
    public f(@k Map<Integer, d> map, @k e.a aVar) {
        this.f8878a = map;
        this.f8879b = aVar;
    }

    @Override // JK0.e
    @k
    public final d a(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        Map<Integer, d> map = this.f8878a;
        d dVar = map.get(numValueOf);
        if (dVar != null) {
            return dVar;
        }
        this.f8879b.onError(new UnsupportedAttributedTextVersionException("Попытка использовать AttributedText версии выше поддерживаемой (последняя версия = " + ((Integer) Collections.max(map.keySet())).intValue() + ", целевая версия = " + i12 + ')'));
        return map.get(0);
    }

    public /* synthetic */ f(Map map, e.a aVar, int i12, C42822w c42822w) {
        this(map, (i12 & 2) != 0 ? new a() : aVar);
    }

    /* compiled from: FormatterRuleFactory.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"JK0/f$a", "LJK0/e$a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e.a {
        @Override // JK0.e.a
        public final void onError(@k Exception exc) {
        }
    }
}
