package defpackage;

import android.content.SharedPreferences;
import android.text.TextPaint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.net.client.impl.internal.SocketFactoryCreateException;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ni implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ni(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (RLottieDrawable) ((p8) this.b).invoke(obj);
            case 1:
                return (f9a) ((n8) this.b).invoke(obj);
            case 2:
                fj0 fj0Var = (fj0) this.b;
                String str = (String) obj;
                try {
                    fj0Var.a.a.e();
                    return fj0Var.c.a(str);
                } catch (IOException e) {
                    throw new SocketFactoryCreateException(e);
                }
            case 3:
                X509Certificate x509Certificate = (X509Certificate) obj;
                ((f72) this.b).getClass();
                try {
                    return x509Certificate.getEncoded();
                } catch (CertificateEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            case 4:
                return (f9a) ((d63) this.b).invoke(obj);
            case 5:
                return (f9a) ((d92) this.b).invoke(obj);
            case 6:
                return (f9a) ((c63) this.b).invoke(obj);
            case 7:
                return (f9a) ((c63) this.b).invoke(obj);
            case 8:
                return (f9a) ((d63) this.b).invoke(obj);
            case 9:
                return (f9a) ((d63) this.b).invoke(obj);
            case 10:
                return (f9a) ((k03) this.b).invoke(obj);
            case 11:
                return (f9a) ((ia) this.b).invoke(obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                db4 db4Var = (db4) this.b;
                int iIntValue = ((Integer) obj).intValue();
                int i = db4Var.n - db4Var.m;
                int iMin = Integer.min(i, iIntValue - 10);
                if (iMin == 0) {
                    return null;
                }
                if (iMin < i) {
                    db4Var.e.g(new ni(12, db4Var), 10, db4Var.b, new m4(7, db4Var));
                }
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int iMin2 = Integer.min(iMin - i2, ((ByteBuffer) db4Var.k.get(0)).remaining());
                    ((ByteBuffer) db4Var.k.get(0)).get(bArr, i2, iMin2);
                    if (((ByteBuffer) db4Var.k.get(0)).remaining() == 0) {
                        db4Var.k.remove(0);
                    }
                    i2 += iMin2;
                }
                Object obj2 = db4Var.a.b;
                long j = db4Var.m;
                ya4 ya4Var = new ya4();
                ya4Var.a = j;
                ya4Var.c = bArr;
                ya4Var.b = iMin;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMin + 12);
                epi.b(6, byteBufferAllocate);
                epi.c(j, byteBufferAllocate);
                epi.b(iMin, byteBufferAllocate);
                byteBufferAllocate.put(bArr);
                byte[] bArr2 = new byte[byteBufferAllocate.position()];
                byteBufferAllocate.get(bArr2);
                db4Var.m += iMin;
                return ya4Var;
            case 13:
                return (qt7) ((p8) this.b).invoke(obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((mde[]) ((pa5) this.b).a)[((hf5) obj).ordinal()];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((n17) this.b).getClass();
                Object[] objArr = {(String) ((Map.Entry) obj).getValue()};
                ArrayList arrayList = new ArrayList(1);
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                arrayList.add(obj3);
                return Collections.unmodifiableList(arrayList);
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                List list = (List) ((List) entry.getValue()).stream().filter(new cn4((BiPredicate) this.b, 1, entry)).collect(Collectors.toList());
                if (list.isEmpty()) {
                    return Optional.empty();
                }
                String str2 = (String) entry.getKey();
                Objects.requireNonNull(str2);
                return Optional.of(new AbstractMap.SimpleImmutableEntry(str2, list));
            case LangUtils.HASH_SEED /* 17 */:
                return (tlb) ((lk8) this.b).g.get((Long) obj);
            case 18:
                return (j9a) ((dga) this.b).invoke(obj);
            case 19:
                return (ExecutorService) ((ia) this.b).invoke(obj);
            case 20:
                return (ok) ((b7b) this.b).invoke(obj);
            case 21:
                ((ia) this.b).invoke(obj);
                return null;
            case 22:
                return (ThreadFactory) ((dfb) this.b).invoke(obj);
            case 23:
                return (d7c) ((a7c) this.b).invoke(obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (d7c) ((uv1) this.b).invoke(obj);
            case 25:
                return (f9a) ((dga) this.b).invoke(obj);
            case 26:
                return (f9a) ((k03) this.b).invoke(obj);
            case 27:
                return (SharedPreferences) ((a7c) this.b).invoke(obj);
            default:
                return (TextPaint) ((a7c) this.b).invoke(obj);
        }
    }
}
