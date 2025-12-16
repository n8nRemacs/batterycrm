package ru.ok.android.externcalls.sdk.ml;

import android.content.Context;
import defpackage.e2f;
import defpackage.gu3;
import defpackage.il8;
import defpackage.qu1;
import defpackage.y6d;
import defpackage.zl3;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManager;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.android.externcalls.sdk.ml.delegate.KwsFeatureDelegate;
import ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/MLFeaturesManagerImpl;", "Lru/ok/android/externcalls/sdk/ml/MLFeaturesManager;", "Lil8;", "mlFeaturesInfoDataSource", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "downloadService", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;", "keywordSpotterManager", "Ly6d;", "logger", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "conversationStats", "<init>", "(Lil8;Lru/ok/android/externcalls/sdk/net/DownloadService;Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;Ly6d;Lru/ok/android/externcalls/sdk/api/RemoteSettings;Lru/ok/android/externcalls/sdk/stat/ConversationStats;)V", "Ljava/io/File;", "file", "Lqqg;", "setKwsParams", "(Ljava/io/File;)V", "start", "()V", "dispose", "Lil8;", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;", "Ly6d;", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "Lzl3;", "disposables", "Lzl3;", "Lru/ok/android/externcalls/sdk/ml/config/KwsFeaturesConfigProviderImpl;", "kwsConfigProvider", "Lru/ok/android/externcalls/sdk/ml/config/KwsFeaturesConfigProviderImpl;", "Lru/ok/android/externcalls/sdk/ml/delegate/KwsFeatureDelegate;", "kwsFeatureDelegate", "Lru/ok/android/externcalls/sdk/ml/delegate/KwsFeatureDelegate;", "", "delegates", "Ljava/util/List;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MLFeaturesManagerImpl implements MLFeaturesManager {
    private final Context context;
    private final ConversationStats conversationStats;
    private final List<KwsFeatureDelegate> delegates;
    private final zl3 disposables = new zl3();
    private final DownloadService downloadService;
    private final KeywordSpotterManager keywordSpotterManager;
    private final KwsFeaturesConfigProviderImpl kwsConfigProvider;
    private final KwsFeatureDelegate kwsFeatureDelegate;
    private final y6d logger;
    private final il8 mlFeaturesInfoDataSource;

    public MLFeaturesManagerImpl(il8 il8Var, DownloadService downloadService, Context context, KeywordSpotterManager keywordSpotterManager, y6d y6dVar, RemoteSettings remoteSettings, ConversationStats conversationStats) {
        this.mlFeaturesInfoDataSource = il8Var;
        this.downloadService = downloadService;
        this.context = context;
        this.keywordSpotterManager = keywordSpotterManager;
        this.logger = y6dVar;
        this.conversationStats = conversationStats;
        KwsFeaturesConfigProviderImpl kwsFeaturesConfigProviderImpl = new KwsFeaturesConfigProviderImpl(remoteSettings, y6dVar, String.format("android.mlfeatures.%s", Arrays.copyOf(new Object[]{KwsFeatureDelegate.CURRENT_WS_MODEL_VERSION}, 1)));
        this.kwsConfigProvider = kwsFeaturesConfigProviderImpl;
        KwsFeatureDelegate kwsFeatureDelegate = new KwsFeatureDelegate(il8Var, kwsFeaturesConfigProviderImpl, downloadService, conversationStats.mlDownloadStat, context, y6dVar);
        this.kwsFeatureDelegate = kwsFeatureDelegate;
        this.delegates = Collections.singletonList(kwsFeatureDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setKwsParams(File file) {
        this.keywordSpotterManager.setKeywordSpotterParams(new KeywordSpotterManager.KeywordSpotterParams(file != null, file != null ? file.getAbsolutePath() : null));
    }

    @Override // ru.ok.android.externcalls.sdk.ml.MLFeaturesManager
    public void dispose() {
        this.disposables.dispose();
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((KwsFeatureDelegate) it.next()).dispose();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ml.MLFeaturesManager
    public void start() {
        e2f e2fVarCheckModel = this.kwsFeatureDelegate.checkModel();
        gu3 gu3Var = new gu3() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl.start.1
            @Override // defpackage.gu3
            public final void accept(MLModelCheckResult mLModelCheckResult) {
                if (mLModelCheckResult instanceof MLModelCheckResult.Disabled) {
                    MLFeaturesManagerImpl.this.setKwsParams(null);
                    return;
                }
                if (mLModelCheckResult instanceof MLModelCheckResult.Enabled) {
                    MLFeaturesManagerImpl.this.setKwsParams(((MLModelCheckResult.Enabled) mLModelCheckResult).getFile());
                    if (mLModelCheckResult instanceof MLModelCheckResult.Enabled.UpdatedModel) {
                        MLModelCheckResult.Enabled.UpdatedModel updatedModel = (MLModelCheckResult.Enabled.UpdatedModel) mLModelCheckResult;
                        MLFeaturesManagerImpl.this.conversationStats.mlDownloadStat.readyToUse(updatedModel.getVersion(), updatedModel.getDownloadDurationMs());
                    }
                }
            }
        };
        gu3 gu3Var2 = new gu3() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl.start.2
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                MLFeaturesManagerImpl.this.setKwsParams(null);
            }
        };
        e2fVarCheckModel.getClass();
        qu1 qu1Var = new qu1(gu3Var, 2, gu3Var2);
        e2fVarCheckModel.k(qu1Var);
        this.disposables.a(qu1Var);
    }
}
