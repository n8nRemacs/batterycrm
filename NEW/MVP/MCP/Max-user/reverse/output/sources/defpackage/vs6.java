package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.CameraEnumerationAndroid;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class vs6 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ vs6(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return b5j.b(Long.valueOf(((eh9) obj).getC()), Long.valueOf(((eh9) obj2).getC()));
            case 1:
                return b5j.b(Long.valueOf(((eh9) obj).getC()), Long.valueOf(((eh9) obj2).getC()));
            case 2:
                return b5j.b(((omf) obj).a, ((omf) obj2).a);
            case 3:
                return b5j.b(Long.valueOf(((vd8) obj2).o), Long.valueOf(((vd8) obj).o));
            case 4:
                return b5j.b(Long.valueOf(((vd8) obj2).o), Long.valueOf(((vd8) obj).o));
            case 5:
                return b5j.b(Long.valueOf(((vd8) obj2).o), Long.valueOf(((vd8) obj).o));
            case 6:
                return b5j.b(Byte.valueOf(((vk7) obj2).e), Byte.valueOf(((vk7) obj).e));
            case 7:
                return b5j.b(Integer.valueOf(xpi.k((String) ((Map.Entry) obj).getKey())), Integer.valueOf(xpi.k((String) ((Map.Entry) obj2).getKey())));
            case 8:
                return b5j.b(Long.valueOf(((gg8) obj).a), Long.valueOf(((gg8) obj2).a));
            case 9:
                return b5j.b(Long.valueOf(((ps2) obj2).m), Long.valueOf(((ps2) obj).m));
            case 10:
                return b5j.b(Long.valueOf(((lt5) obj).g), Long.valueOf(((lt5) obj2).g));
            case 11:
                return b5j.b(Long.valueOf(((ls8) obj).o), Long.valueOf(((ls8) obj2).o));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return b5j.b(((File) obj2).getName(), ((File) obj).getName());
            case 13:
                return b5j.b(((File) obj).getName(), ((File) obj2).getName());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return b5j.b(Integer.valueOf(((aqb) obj).b), Integer.valueOf(((aqb) obj2).b));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return b5j.b(Integer.valueOf(((aqb) obj).b), Integer.valueOf(((aqb) obj2).b));
            case 16:
                return b5j.b(Integer.valueOf(((qqb) obj).c), Integer.valueOf(((qqb) obj2).c));
            case LangUtils.HASH_SEED /* 17 */:
                return b5j.b(Boolean.valueOf(((xx3) obj2).Z), Boolean.valueOf(((xx3) obj).Z));
            case 18:
                return ((m6f) obj).b - ((m6f) obj2).b;
            case 19:
                pb2 pb2Var = ((u6e) obj2).d;
                Long lValueOf = pb2Var != null ? Long.valueOf(pb2Var.o()) : null;
                pb2 pb2Var2 = ((u6e) obj).d;
                return b5j.b(lValueOf, pb2Var2 != null ? Long.valueOf(pb2Var2.o()) : null);
            case 20:
                return b5j.b(Long.valueOf(((pb2) obj2).o()), Long.valueOf(((pb2) obj).o()));
            case 21:
                return b5j.b(Long.valueOf(Files.readAttributes(Paths.get(((File) obj).getAbsolutePath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis()), Long.valueOf(Files.readAttributes(Paths.get(((File) obj2).getAbsolutePath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis()));
            case 22:
                return b5j.b(Long.valueOf(((ry0) obj2).b), Long.valueOf(((ry0) obj).b));
            case 23:
                return b5j.b(Boolean.valueOf(!((dgf) obj).Z), Boolean.valueOf(!((dgf) obj2).Z));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 25:
                return b5j.b(((v3h) ((xy8) ((bdh) obj2).c)).b(), ((v3h) ((xy8) ((bdh) obj).c)).b());
            case 26:
                return ((ogh) obj).a - ((ogh) obj2).a;
            case 27:
                CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
                return Integer.compare(captureFormat2.width * captureFormat2.height, captureFormat.width * captureFormat.height);
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }

    public vs6(tme tmeVar) {
        this.a = 21;
    }
}
