package Pg;

import Tg.C15362a;
import Vg.C15674a;
import Y61.k;
import Y61.l;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.barcode_encoder.EncodeHintType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MultiFormatWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPg/d;", "LPg/g;", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f13229a = new d();

    /* compiled from: MultiFormatWriter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13230a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            try {
                iArr[BarcodeFormat.CODE128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeFormat.EAN13.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodeFormat.ITF14.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarcodeFormat.f98753QR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13230a = iArr;
        }
    }

    @Override // Pg.g
    @k
    public final Rg.b a(@k String str, @k BarcodeFormat barcodeFormat, int i12, int i13, @l Map<EncodeHintType, ?> map) {
        g bVar;
        int i14 = a.f13230a[barcodeFormat.ordinal()];
        if (i14 == 1) {
            bVar = new com.avito.android.barcode_encoder.code128.b();
        } else if (i14 == 2) {
            bVar = new C15362a();
        } else if (i14 == 3) {
            bVar = new Ug.b();
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new C15674a();
        }
        return bVar.a(str, barcodeFormat, i12, i13, map);
    }
}
