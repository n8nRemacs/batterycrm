package E71;

/* compiled from: MockitoAssertionError.java */
/* loaded from: classes7.dex */
public class a extends AssertionError {
    private static final long serialVersionUID = 1;

    public a(String str) {
        super(str);
        getStackTrace();
        new org.mockito.internal.exceptions.stacktrace.a().a(this);
    }
}
