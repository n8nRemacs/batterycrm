package defpackage;

import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes.dex */
public abstract class lui {
    public static int a(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            ff6 ff6Var = new ff6();
            ff6Var.m = xz9.n("video/avc");
            hf6 hf6Var = new hf6(ff6Var);
            String str = hf6Var.n;
            if (str != null) {
                List listD = dx8.d(str, z, false);
                String strB = dx8.b(hf6Var);
                Iterable iterableD = strB == null ? zjd.o : dx8.d(strB, z, false);
                tg7 tg7VarI = wg7.i();
                tg7VarI.d(listD);
                tg7VarI.d(iterableD);
                zjd zjdVarI = tg7VarI.i();
                for (int i = 0; i < zjdVarI.d; i++) {
                    if (((pw8) zjdVarI.get(i)).d != null && (videoCapabilities = ((pw8) zjdVarI.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        y35.n();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointF = y35.f();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (y35.h(supportedPerformancePoints.get(i2)).covers(performancePointF)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static p4i b(z4i z4iVar, Integer num, a6i a6iVar) {
        BacklogWorker backlogWorker;
        ogb ogbVar = (ogb) ((ngb) new ngb(BacklogWorker.class).setBackoffCriteria(eg0.b, num.longValue(), TimeUnit.SECONDS)).build();
        if (a6iVar != null && (backlogWorker = BacklogWorker.X) != null) {
            synchronized (backlogWorker.c) {
                wqi.c("BACKLOG_WORKER", "stayAlive, isRunning = %b", Boolean.valueOf(backlogWorker.o));
                backlogWorker.d.add(a6iVar.a);
            }
        }
        uk5 uk5Var = uk5.b;
        z4iVar.getClass();
        List listSingletonList = Collections.singletonList(ogbVar);
        c5i c5iVar = (c5i) z4iVar;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new p4i(c5iVar, "BACKLOG_WORKER", uk5Var, listSingletonList, 0);
    }

    public static void c(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(ho7.f(i2, "at index "));
            }
        }
    }
}
