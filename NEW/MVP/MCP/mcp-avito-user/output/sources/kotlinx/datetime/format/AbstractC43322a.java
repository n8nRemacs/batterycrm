package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;
import kotlinx.datetime.internal.format.parser.ParseException;

/* compiled from: DateTimeFormat.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lkotlinx/datetime/format/a;", "T", "Lkotlinx/datetime/internal/format/parser/c;", "U", "Lkotlinx/datetime/format/B;", "<init>", "()V", "Lkotlinx/datetime/format/y;", "Lkotlinx/datetime/format/P;", "Lkotlinx/datetime/format/W;", "Lkotlinx/datetime/format/b0;", "Lkotlinx/datetime/format/y0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43322a<T, U extends InterfaceC43377c<U>> implements B<T> {
    public /* synthetic */ AbstractC43322a(C42822w c42822w) {
        this();
    }

    @Override // kotlinx.datetime.format.B
    public final T a(@Y61.k CharSequence charSequence) {
        String str;
        try {
            try {
                return d(kotlinx.datetime.internal.format.parser.n.a(b().f412521c, charSequence, c()));
            } catch (IllegalArgumentException e12) {
                String message = e12.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e12);
            }
        } catch (ParseException e13) {
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + '\'', e13);
        }
    }

    @Y61.k
    public abstract C43374f<U> b();

    @Y61.k
    public abstract U c();

    public abstract T d(@Y61.k U u12);

    public AbstractC43322a() {
    }
}
