package ru.ok.android.externcalls.sdk.settings;

import defpackage.de;
import defpackage.e2f;
import defpackage.gu3;
import defpackage.i2f;
import defpackage.i42;
import defpackage.j0e;
import defpackage.jta;
import defpackage.l2f;
import defpackage.m3f;
import defpackage.m7c;
import defpackage.n42;
import defpackage.nm0;
import defpackage.ora;
import defpackage.pdf;
import defpackage.py4;
import defpackage.rd5;
import defpackage.ssa;
import defpackage.tk4;
import defpackage.tm6;
import defpackage.ty4;
import defpackage.u0e;
import defpackage.ue3;
import defpackage.v08;
import defpackage.we3;
import defpackage.wk3;
import defpackage.y6d;
import defpackage.z9a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsImpl;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Ly6d;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Ly6d;)V", "Lqqg;", "drainEmitters", "()V", "requestReadSettings", "", "key", "Le2f;", "get", "(Ljava/lang/String;)Le2f;", "release", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Ly6d;", "", "cachedSettings", "Ljava/util/Map;", "Lpy4;", "requestSettingsDisposable", "Lpy4;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lru/ok/android/externcalls/sdk/settings/RemoteSettingsImpl$KeyListener;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lnm0;", "", "wantedSettings", "Lnm0;", "Companion", "KeyListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoteSettingsImpl implements RemoteSettings {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "RemoteSettings";
    private final Map<String, String> cachedSettings = new LinkedHashMap();
    private final CopyOnWriteArrayList<KeyListener> listeners = new CopyOnWriteArrayList<>();
    private final y6d log;
    private final OkApiServiceInternal okApiService;
    private final py4 requestSettingsDisposable;
    private final nm0 wantedSettings;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsImpl$KeyListener;", "", "", "key", "Ll2f;", "emitter", "<init>", "(Ljava/lang/String;Ll2f;)V", "", "values", "Lqqg;", "emit", "(Ljava/util/Map;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Ll2f;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KeyListener {
        private final l2f emitter;
        private final String key;

        public KeyListener(String str, l2f l2fVar) {
            this.key = str;
            this.emitter = l2fVar;
        }

        public final void emit(Map<String, String> values) {
            l2f l2fVar = this.emitter;
            String str = values.get(this.key);
            if (str == null) {
                str = "";
            }
            ((i2f) l2fVar).a(str);
        }

        public final String getKey() {
            return this.key;
        }
    }

    public RemoteSettingsImpl(OkApiServiceInternal okApiServiceInternal, y6d y6dVar) {
        this.okApiService = okApiServiceInternal;
        this.log = y6dVar;
        nm0 nm0VarT = nm0.t(rd5.a);
        this.wantedSettings = nm0VarT;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        ssa ssaVarL = new ora(new jta(nm0VarT, 100L, timeUnit, j0eVarA).g(new m7c() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImpl.1
            @Override // defpackage.m7c
            public final boolean test(Set<String> set) {
                return !set.isEmpty();
            }
        }), new tm6() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImpl.2
            @Override // defpackage.tm6
            public final m3f apply(Set<String> set) {
                RemoteSettingsImpl.this.log.log(RemoteSettingsImpl.LOG_TAG, "Will now read settings by keys " + set);
                return RemoteSettingsImpl.this.okApiService.getSettings(set);
            }
        }, 3).l(de.a());
        v08 v08Var = new v08(new gu3() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImpl.3
            @Override // defpackage.gu3
            public final void accept(Map<String, String> map) {
                RemoteSettingsImpl.this.log.log(RemoteSettingsImpl.LOG_TAG, map.size() + " keys were loaded");
                RemoteSettingsImpl.this.cachedSettings.putAll(map);
                RemoteSettingsImpl.this.drainEmitters();
            }
        }, new gu3() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImpl.4
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                RemoteSettingsImpl.this.log.reportException(RemoteSettingsImpl.LOG_TAG, "Error reading remote SDK settings", th);
            }
        }, pdf.d);
        ssaVarL.a(v08Var);
        this.requestSettingsDisposable = v08Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drainEmitters() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((KeyListener) it.next()).emit(this.cachedSettings);
        }
        this.listeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void get$lambda$1(String str, final RemoteSettingsImpl remoteSettingsImpl, l2f l2fVar) {
        final KeyListener keyListener = new KeyListener(str, l2fVar);
        if (remoteSettingsImpl.cachedSettings.containsKey(str)) {
            keyListener.emit(remoteSettingsImpl.cachedSettings);
            return;
        }
        remoteSettingsImpl.listeners.add(keyListener);
        i42 i42Var = new i42() { // from class: ru.ok.android.externcalls.sdk.settings.a
            @Override // defpackage.i42
            public final void cancel() {
                RemoteSettingsImpl.get$lambda$1$lambda$0(this.a, keyListener);
            }
        };
        i2f i2fVar = (i2f) l2fVar;
        i2fVar.getClass();
        ty4.g(i2fVar, new n42(i42Var));
        remoteSettingsImpl.requestReadSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void get$lambda$1$lambda$0(RemoteSettingsImpl remoteSettingsImpl, KeyListener keyListener) {
        remoteSettingsImpl.listeners.remove(keyListener);
    }

    private final void requestReadSettings() {
        CopyOnWriteArrayList<KeyListener> copyOnWriteArrayList = this.listeners;
        ArrayList arrayList = new ArrayList(we3.q(copyOnWriteArrayList, 10));
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(((KeyListener) it.next()).getKey());
        }
        Set setH0 = ue3.h0(arrayList);
        if (setH0.isEmpty()) {
            return;
        }
        this.wantedSettings.f(setH0);
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public e2f get(String key) {
        this.log.log(LOG_TAG, "Request for a key ".concat(key));
        return new wk3(2, new z9a(key, 14, this)).m(de.a()).i(de.a());
    }

    public final void release() {
        this.requestSettingsDisposable.dispose();
    }
}
