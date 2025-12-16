package ru.ok.android.externcalls.sdk.ml.delegate;

import android.content.Context;
import defpackage.gke;
import defpackage.il8;
import defpackage.jz5;
import defpackage.y6d;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ml.config.MLFeaturesConfigProvider;
import ru.ok.android.externcalls.sdk.ml.model.MLFeatureType;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/KwsFeatureDelegate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate;", "Lil8;", "mlFeaturesInfoDataSource", "Lru/ok/android/externcalls/sdk/ml/config/MLFeaturesConfigProvider;", "mlFeaturesConfigProvider", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "downloadService", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "mlDownloadStat", "Landroid/content/Context;", "context", "Ly6d;", "logger", "<init>", "(Lil8;Lru/ok/android/externcalls/sdk/ml/config/MLFeaturesConfigProvider;Lru/ok/android/externcalls/sdk/net/DownloadService;Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;Landroid/content/Context;Ly6d;)V", "Ljava/io/File;", "modelDir", "", "isModelIntegral", "(Ljava/io/File;)Z", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KwsFeatureDelegate extends MLFeatureDelegate {
    private static final String CONFIG_FILE_EXT = "cfg";
    public static final String CURRENT_WS_MODEL_VERSION = "ws_0";
    private static final String MODEL_FILE_EXT = "tflite";

    public KwsFeatureDelegate(il8 il8Var, MLFeaturesConfigProvider mLFeaturesConfigProvider, DownloadService downloadService, MLDownloadStat mLDownloadStat, Context context, y6d y6dVar) {
        super(il8Var, mLFeaturesConfigProvider, downloadService, mLDownloadStat, MLFeatureType.WS, CURRENT_WS_MODEL_VERSION, y6dVar, context);
    }

    @Override // ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate
    public boolean isModelIntegral(File modelDir) {
        File[] fileArrListFiles;
        if (!modelDir.exists() || !modelDir.isDirectory() || (fileArrListFiles = modelDir.listFiles()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(jz5.c(file));
        }
        return arrayList.containsAll(gke.h(MODEL_FILE_EXT, CONFIG_FILE_EXT));
    }
}
