package org.joda.time;

/* loaded from: classes7.dex */
public class IllegalFieldValueException extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;

    /* renamed from: b, reason: collision with root package name */
    public String f420437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalFieldValueException(String str, Integer num, Integer num2) {
        super(a(num, 1, num2, "dayOfMonth", str));
        AbstractC44865g abstractC44865g = AbstractC44865g.f420881c;
        this.f420437b = super.getMessage();
    }

    public static String a(Integer num, Integer num2, Integer num3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder("Value ");
        sb2.append(num);
        sb2.append(" for ");
        sb2.append(str);
        sb2.append(' ');
        if (num2 == null) {
            if (num3 == null) {
                sb2.append("is not supported");
            } else {
                sb2.append("must not be larger than ");
                sb2.append(num3);
            }
        } else if (num3 == null) {
            sb2.append("must not be smaller than ");
            sb2.append(num2);
        } else {
            sb2.append("must be in the range [");
            sb2.append(num2);
            sb2.append(',');
            sb2.append(num3);
            sb2.append(']');
        }
        if (str2 != null) {
            sb2.append(": ");
            sb2.append(str2);
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f420437b;
    }

    public IllegalFieldValueException(AbstractC44865g abstractC44865g, Integer num, Integer num2, Integer num3) {
        super(a(num, num2, num3, abstractC44865g.f420904b, null));
        this.f420437b = super.getMessage();
    }

    public IllegalFieldValueException(AbstractC44865g abstractC44865g, Integer num, String str) {
        super(a(num, null, null, abstractC44865g.f420904b, str));
        this.f420437b = super.getMessage();
    }

    public IllegalFieldValueException(AbstractC44865g abstractC44865g, String str) {
        String str2 = abstractC44865g.f420904b;
        StringBuffer stringBuffer = new StringBuffer("Value ");
        if (str == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }
        stringBuffer.append(" for ");
        stringBuffer.append(str2);
        stringBuffer.append(" is not supported");
        super(stringBuffer.toString());
        this.f420437b = super.getMessage();
    }
}
