package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43058o;

/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/n;", "", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43057n {

    /* compiled from: MatchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.n$a */
    public static final class a {
    }

    /* compiled from: MatchResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/n$b;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC43057n f410614a;

        public b(@Y61.k InterfaceC43057n interfaceC43057n) {
            this.f410614a = interfaceC43057n;
        }
    }

    @Y61.k
    kotlin.ranges.l b();

    @Y61.k
    b c();

    @Y61.k
    List<String> d();

    @Y61.k
    /* renamed from: getGroups */
    C43058o.b getF410617c();

    @Y61.k
    String getValue();

    @Y61.l
    InterfaceC43057n next();
}
