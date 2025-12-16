package ru.ok.android.externcalls.sdk.ml.delegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import defpackage.az1;
import defpackage.de;
import defpackage.e2f;
import defpackage.em6;
import defpackage.fni;
import defpackage.g76;
import defpackage.gu3;
import defpackage.hn6;
import defpackage.hz5;
import defpackage.il8;
import defpackage.k2f;
import defpackage.lbj;
import defpackage.m2f;
import defpackage.m3f;
import defpackage.m76;
import defpackage.nn6;
import defpackage.qqg;
import defpackage.r66;
import defpackage.rm0;
import defpackage.s7c;
import defpackage.tm6;
import defpackage.u0e;
import defpackage.u2f;
import defpackage.ue3;
import defpackage.y07;
import defpackage.y6d;
import defpackage.zl3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileAlreadyExistsException;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfig;
import ru.ok.android.externcalls.sdk.ml.config.MLFeaturesConfigProvider;
import ru.ok.android.externcalls.sdk.ml.model.AvailableMLFeatureInfo;
import ru.ok.android.externcalls.sdk.ml.model.MLFeatureType;
import ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult;
import ru.ok.android.externcalls.sdk.ml.stage.DownloadStage;
import ru.ok.android.externcalls.sdk.ml.stage.SaveNewModelInfoStage;
import ru.ok.android.externcalls.sdk.ml.stage.UnzipStage;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.FileValidationConfig;
import ru.ok.android.externcalls.sdk.net.internal.DownloadResult;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 C2\u00020\u0001:\u0002CDBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020)2\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H$¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002050\u001a¢\u0006\u0004\b6\u0010\u001dJ\r\u00107\u001a\u00020)¢\u0006\u0004\b7\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate;", "", "Lil8;", "mlFeaturesInfoDataSource", "Lru/ok/android/externcalls/sdk/ml/config/MLFeaturesConfigProvider;", "mlFeaturesConfigProvider", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "downloadService", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "mlDownloadStat", "Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "type", "", "actualModelVersion", "Ly6d;", "logger", "Landroid/content/Context;", "context", "<init>", "(Lil8;Lru/ok/android/externcalls/sdk/ml/config/MLFeaturesConfigProvider;Lru/ok/android/externcalls/sdk/net/DownloadService;Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;Ljava/lang/String;Ly6d;Landroid/content/Context;)V", "downloadDir", "()Ljava/lang/String;", "fileName", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "validateCurrentModel", "()Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "Le2f;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "fetchConfig", "()Le2f;", "config", "Lru/ok/android/externcalls/sdk/ml/stage/DownloadStage;", "downloadModel", "(Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;)Le2f;", "stage", "Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;", "unzipModel", "(Lru/ok/android/externcalls/sdk/ml/stage/DownloadStage;)Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;", "Lru/ok/android/externcalls/sdk/ml/stage/SaveNewModelInfoStage;", "saveNewModelInfo", "(Lru/ok/android/externcalls/sdk/ml/stage/UnzipStage;)Lru/ok/android/externcalls/sdk/ml/stage/SaveNewModelInfoStage;", "Lqqg;", "clearDir", "()V", "removeCurrentModel", "msg", "log", "(Ljava/lang/String;)V", "Ljava/io/File;", "modelDir", "", "isModelIntegral", "(Ljava/io/File;)Z", "Lru/ok/android/externcalls/sdk/ml/model/MLModelCheckResult;", "checkModel", "dispose", "Lil8;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeaturesConfigProvider;", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "Lru/ok/android/externcalls/sdk/ml/model/MLFeatureType;", "Ljava/lang/String;", "Ly6d;", "Landroid/content/Context;", "Lzl3;", "disposables", "Lzl3;", "Companion", "MLModelValidationResult", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class MLFeatureDelegate {
    private static final String LOG_TAG = "MLFeatureDelegate";
    private static final String ML_FEATURES_DIR_NAME = "ml_features";
    private static final String ZIP_EXTENSION = "zip";
    private final String actualModelVersion;
    private final Context context;
    private final zl3 disposables = new zl3();
    private final DownloadService downloadService;
    private final y6d logger;
    private final MLDownloadStat mlDownloadStat;
    private final MLFeaturesConfigProvider mlFeaturesConfigProvider;
    private final il8 mlFeaturesInfoDataSource;
    private final MLFeatureType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "", "NeedUpdate", "UpToDate", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$NeedUpdate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$UpToDate;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MLModelValidationResult {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$NeedUpdate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", IceCandidatePairChangedStat.KEY_REASON, "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NeedUpdate implements MLModelValidationResult {
            private final String reason;

            public NeedUpdate(String str) {
                this.reason = str;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult$UpToDate;", "Lru/ok/android/externcalls/sdk/ml/delegate/MLFeatureDelegate$MLModelValidationResult;", "model", "Ljava/io/File;", "(Ljava/io/File;)V", "getModel", "()Ljava/io/File;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UpToDate implements MLModelValidationResult {
            private final File model;

            public UpToDate(File file) {
                this.model = file;
            }

            public final File getModel() {
                return this.model;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$unzipModel$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00501 extends hn6 implements em6 {
        public C00501(Object obj) {
            super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return qqg.a;
        }

        public final void invoke(String str) {
            ((MLFeatureDelegate) this.receiver).log(str);
        }
    }

    public MLFeatureDelegate(il8 il8Var, MLFeaturesConfigProvider mLFeaturesConfigProvider, DownloadService downloadService, MLDownloadStat mLDownloadStat, MLFeatureType mLFeatureType, String str, y6d y6dVar, Context context) {
        this.mlFeaturesInfoDataSource = il8Var;
        this.mlFeaturesConfigProvider = mLFeaturesConfigProvider;
        this.downloadService = downloadService;
        this.mlDownloadStat = mLDownloadStat;
        this.type = mLFeatureType;
        this.actualModelVersion = str;
        this.logger = y6dVar;
        this.context = context;
    }

    private final void clearDir() {
        File[] fileArrListFiles = new File(downloadDir()).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                lbj.a(file, new MLFeatureDelegate$clearDir$1$1(this));
            }
        }
    }

    private final String downloadDir() {
        return this.context.getFilesDir() + "/ml_features/" + this.type.getSubDirName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e2f downloadModel(MLFeatureConfig config) {
        log("Start download " + this.type + " model file. url = " + config.getUrl());
        final File file = new File(downloadDir(), fileName());
        m3f m3fVarDownload = this.downloadService.download(config.getUrl(), file, new FileValidationConfig(config.getChecksum(), y07.MD5));
        rm0 rm0Var = new rm0() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.downloadModel.1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C00041 extends hn6 implements em6 {
                public C00041(Object obj) {
                    super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
                }

                @Override // defpackage.em6
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return qqg.a;
                }

                public final void invoke(String str) {
                    ((MLFeatureDelegate) this.receiver).log(str);
                }
            }

            @Override // defpackage.rm0
            public /* bridge */ /* synthetic */ boolean test(Object obj, Object obj2) {
                return test(((Number) obj).intValue(), (Throwable) obj2);
            }

            public final boolean test(int i, Throwable th) {
                boolean z = th instanceof FileAlreadyExistsException;
                if (z) {
                    lbj.a(file, new C00041(this));
                }
                return i <= 1 && z;
            }
        };
        m3fVarDownload.getClass();
        return new m76(new g76(m3fVarDownload instanceof nn6 ? ((nn6) m3fVarDownload).d() : new r66(4, m3fVarDownload), rm0Var, 0)).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.downloadModel.2
            @Override // defpackage.tm6
            public final DownloadStage apply(DownloadResult downloadResult) {
                return new DownloadStage(downloadResult.getFile(), downloadResult.getDownloadDurationMs());
            }
        });
    }

    private final e2f fetchConfig() {
        return this.mlFeaturesConfigProvider.getConfig();
    }

    private final String fileName() {
        return az1.i(this.actualModelVersion, ".zip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String msg) {
        this.logger.log(LOG_TAG, msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeCurrentModel() {
        il8 il8Var = this.mlFeaturesInfoDataSource;
        ((SharedPreferences) ((s7c) il8Var).b).edit().remove(this.type.getPrefsKey()).apply();
        clearDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveNewModelInfoStage saveNewModelInfo(UnzipStage stage) throws IOException {
        String strEncodeToString;
        log("Saving new " + this.type + " model info");
        AvailableMLFeatureInfo availableMLFeatureInfo = new AvailableMLFeatureInfo(this.type, this.actualModelVersion, stage.getModelDir().getPath());
        il8 il8Var = this.mlFeaturesInfoDataSource;
        String prefsKey = this.type.getPrefsKey();
        s7c s7cVar = (s7c) il8Var;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) s7cVar.b).edit();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(availableMLFeatureInfo);
                    objectOutputStream.close();
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    byteArrayOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            ((y6d) s7cVar.a).logException("PersistentDataSourceImpl", "Error during serializing object " + availableMLFeatureInfo, e);
            strEncodeToString = null;
        }
        editorEdit.putString(prefsKey, strEncodeToString).apply();
        return new SaveNewModelInfoStage(stage.getModelDir(), stage.getDownloadDurationMs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnzipStage unzipModel(DownloadStage stage) {
        try {
            log("Start unzipping " + this.type + " model. file " + stage.getFile());
            String str = (String) ue3.I(hz5.i(new File(downloadDir()), stage.getFile()));
            File parentFile = str != null ? new File(downloadDir(), str).getParentFile() : null;
            if (parentFile == null) {
                throw new IllegalStateException("The archive was unpacked incorrectly");
            }
            UnzipStage unzipStage = new UnzipStage(parentFile, stage.getDownloadDurationMs());
            lbj.a(stage.getFile(), new C00501(this));
            return unzipStage;
        } catch (Throwable th) {
            lbj.a(stage.getFile(), new C00501(this));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MLModelValidationResult validateCurrentModel() throws IOException {
        s7c s7cVar = (s7c) this.mlFeaturesInfoDataSource;
        Object obj = null;
        String string = ((SharedPreferences) s7cVar.b).getString(this.type.getPrefsKey(), null);
        if (string != null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 0));
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object obj2 = (Serializable) objectInputStream.readObject();
                        objectInputStream.close();
                        byteArrayInputStream.close();
                        obj = obj2;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                ((y6d) s7cVar.a).logException("PersistentDataSourceImpl", "Error during deserializing string ".concat(string), e);
            }
        }
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) obj;
        if (availableMLFeatureInfo == null) {
            return new MLModelValidationResult.NeedUpdate("There are no available models");
        }
        if (!fni.a(availableMLFeatureInfo.getVersion(), this.actualModelVersion)) {
            return new MLModelValidationResult.NeedUpdate("The current version is out of date");
        }
        File file = new File(availableMLFeatureInfo.getPath());
        return !isModelIntegral(file) ? new MLModelValidationResult.NeedUpdate("Can not verify model integrity") : new MLModelValidationResult.UpToDate(file);
    }

    public final e2f checkModel() {
        return new m2f(fetchConfig().m(u0e.b()).i(u0e.b()), new tm6() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1
            @Override // defpackage.tm6
            public final m3f apply(MLFeatureConfig mLFeatureConfig) throws IOException {
                MLFeatureDelegate.this.logger.log(MLFeatureDelegate.LOG_TAG, "got ml config " + mLFeatureConfig);
                if (!mLFeatureConfig.getEnabled()) {
                    MLFeatureDelegate.this.logger.log(MLFeatureDelegate.LOG_TAG, "The activation of the " + MLFeatureDelegate.this.type + " has been disabled remotely");
                    return e2f.g(MLModelCheckResult.Disabled.INSTANCE);
                }
                MLModelValidationResult mLModelValidationResultValidateCurrentModel = MLFeatureDelegate.this.validateCurrentModel();
                if (!(mLModelValidationResultValidateCurrentModel instanceof MLModelValidationResult.NeedUpdate)) {
                    if (!(mLModelValidationResultValidateCurrentModel instanceof MLModelValidationResult.UpToDate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MLFeatureDelegate mLFeatureDelegate = MLFeatureDelegate.this;
                    mLFeatureDelegate.log("Current " + mLFeatureDelegate.type + " model is up to date");
                    return e2f.g(new MLModelCheckResult.Enabled.ExistentModel(((MLModelValidationResult.UpToDate) mLModelValidationResultValidateCurrentModel).getModel()));
                }
                MLFeatureDelegate mLFeatureDelegate2 = MLFeatureDelegate.this;
                mLFeatureDelegate2.log("Current " + mLFeatureDelegate2.type + " model is invalid, the update is starting now. Reason: " + ((MLModelValidationResult.NeedUpdate) mLModelValidationResultValidateCurrentModel).getReason());
                MLFeatureDelegate.this.removeCurrentModel();
                e2f e2fVarDownloadModel = MLFeatureDelegate.this.downloadModel(mLFeatureConfig);
                final MLFeatureDelegate mLFeatureDelegate3 = MLFeatureDelegate.this;
                m2f m2fVarH = e2fVarDownloadModel.h(new tm6() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.1
                    @Override // defpackage.tm6
                    public final UnzipStage apply(DownloadStage downloadStage) {
                        return mLFeatureDelegate3.unzipModel(downloadStage);
                    }
                });
                final MLFeatureDelegate mLFeatureDelegate4 = MLFeatureDelegate.this;
                u2f u2fVarI = m2fVarH.h(new tm6() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.2
                    @Override // defpackage.tm6
                    public final SaveNewModelInfoStage apply(UnzipStage unzipStage) {
                        return mLFeatureDelegate4.saveNewModelInfo(unzipStage);
                    }
                }).i(de.a());
                final MLFeatureDelegate mLFeatureDelegate5 = MLFeatureDelegate.this;
                m2f m2fVarH2 = u2fVarI.h(new tm6() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.3
                    @Override // defpackage.tm6
                    public final MLModelCheckResult.Enabled.UpdatedModel apply(SaveNewModelInfoStage saveNewModelInfoStage) {
                        return new MLModelCheckResult.Enabled.UpdatedModel(saveNewModelInfoStage.getFile(), mLFeatureDelegate5.actualModelVersion, saveNewModelInfoStage.getDownloadDurationMs());
                    }
                });
                final MLFeatureDelegate mLFeatureDelegate6 = MLFeatureDelegate.this;
                k2f k2fVar = new k2f(m2fVarH2, new gu3() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.4
                    @Override // defpackage.gu3
                    public final void accept(MLModelCheckResult.Enabled.UpdatedModel updatedModel) {
                        MLFeatureDelegate mLFeatureDelegate7 = mLFeatureDelegate6;
                        mLFeatureDelegate7.log(mLFeatureDelegate7.type + " ml model updated successfully");
                    }
                }, 1);
                final MLFeatureDelegate mLFeatureDelegate7 = MLFeatureDelegate.this;
                return new k2f(k2fVar, new gu3() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate.checkModel.1.5
                    @Override // defpackage.gu3
                    public final void accept(Throwable th) {
                        MLFeatureDelegate mLFeatureDelegate8 = mLFeatureDelegate7;
                        mLFeatureDelegate8.log("Error during " + mLFeatureDelegate8.type + " ml model update: " + th);
                        mLFeatureDelegate7.mlDownloadStat.error(mLFeatureDelegate7.actualModelVersion, th.getMessage());
                    }
                }, 0);
            }
        }, 0);
    }

    public final void dispose() {
        this.disposables.dispose();
    }

    public abstract boolean isModelIntegral(File modelDir);
}
