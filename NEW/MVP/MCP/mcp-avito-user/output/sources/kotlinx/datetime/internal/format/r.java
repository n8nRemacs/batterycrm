package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.InterfaceC43375a;

/* compiled from: FieldFormatDirective.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/internal/format/r;", "Target", "Type", "Lkotlinx/datetime/internal/format/l;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class r<Target, Type> implements l<Target> {

    /* compiled from: FieldFormatDirective.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/r$a;", "Lkotlinx/datetime/internal/format/parser/a;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements InterfaceC43375a<Target, String> {
        public a() {
            throw null;
        }

        @Override // kotlinx.datetime.internal.format.parser.InterfaceC43375a
        public final String c(Object obj, String str) {
            throw null;
        }

        @Override // kotlinx.datetime.internal.format.parser.InterfaceC43375a
        @Y61.k
        public final String getName() {
            throw null;
        }
    }

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Target, String> {
        @Override // Y41.l
        public final String invoke(Object obj) {
            ((r) this.receiver).getClass();
            throw null;
        }
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final n<Target, Type> a() {
        return null;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final J51.e<Target> b() {
        return new J51.j(new b(1, this, r.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0));
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<Target> c() {
        throw null;
    }
}
