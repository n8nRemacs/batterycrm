package SZ0;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class c {
    @RX0.a
    public static int a(int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 90) {
            return 1;
        }
        if (i12 == 180) {
            return 2;
        }
        if (i12 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Invalid rotation: "));
    }
}
