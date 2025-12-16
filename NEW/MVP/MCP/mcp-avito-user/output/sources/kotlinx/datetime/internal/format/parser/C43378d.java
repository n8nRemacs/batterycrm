package kotlinx.datetime.internal.format.parser;

import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlinx.datetime.internal.format.InterfaceC43370b;
import kotlinx.datetime.internal.format.parser.g;

/* compiled from: NumberConsumer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/d;", "Receiver", "Lkotlinx/datetime/internal/format/parser/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43378d<Receiver> extends AbstractC43379e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    public final int f412551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f412552d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43370b f412553e;

    public C43378d(int i12, int i13, @Y61.k InterfaceC43370b interfaceC43370b, @Y61.k String str) {
        super(i12 == i13 ? Integer.valueOf(i12) : null, str, null);
        this.f412551c = i12;
        this.f412552d = i13;
        this.f412553e = interfaceC43370b;
        if (1 > i12 || i12 >= 10) {
            throw new IllegalArgumentException(AK.c.s(G.j(i12, "Invalid minimum length ", " for field "), this.f412555b, ": expected 1..9").toString());
        }
        if (i12 > i13 || i13 >= 10) {
            StringBuilder sbJ = G.j(i13, "Invalid maximum length ", " for field ");
            sbJ.append(this.f412555b);
            sbJ.append(": expected ");
            sbJ.append(i12);
            sbJ.append("..9");
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
    }

    @Override // kotlinx.datetime.internal.format.parser.AbstractC43379e
    @Y61.l
    public final g a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12, int i13) {
        int i14 = i13 - i12;
        int i15 = this.f412551c;
        if (i14 < i15) {
            return new g.c(i15);
        }
        int i16 = this.f412552d;
        if (i14 > i16) {
            return new g.d(i16);
        }
        int iCharAt = 0;
        while (i12 < i13) {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i12) - '0');
            i12++;
        }
        Field fieldC = this.f412553e.c(interfaceC43377c, new I51.c(iCharAt, i14));
        if (fieldC == 0) {
            return null;
        }
        return new g.a(fieldC);
    }
}
