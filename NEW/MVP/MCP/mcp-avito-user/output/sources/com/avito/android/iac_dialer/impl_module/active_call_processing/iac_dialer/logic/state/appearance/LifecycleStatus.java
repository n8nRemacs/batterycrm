package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LifecycleStatus.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus;", "LdL/d;", "", "isAtLeastCreated", "()Z", "isAtLeastStarted", "Companion", "App", "a", "Components", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LifecycleStatus extends dL.d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = Companion.f165517a;
    public static final int NONEXISTENT_ID = -1;

    /* compiled from: LifecycleStatus.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus;", "Created", "Started", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App$Created;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App$Started;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface App extends LifecycleStatus {

        /* compiled from: LifecycleStatus.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App$Created;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "wasStarted", "", "(Z)V", "isAtLeastCreated", "()Z", "isAtLeastStarted", "getWasStarted", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Created implements App {
            public static final int $stable = 0;
            private final boolean isAtLeastCreated = true;
            private final boolean isAtLeastStarted;
            private final boolean wasStarted;

            public Created(boolean z12) {
                this.wasStarted = z12;
            }

            public static /* synthetic */ Created copy$default(Created created, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    z12 = created.wasStarted;
                }
                return created.copy(z12);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getWasStarted() {
                return this.wasStarted;
            }

            @Y61.k
            public final Created copy(boolean wasStarted) {
                return new Created(wasStarted);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Created) && this.wasStarted == ((Created) other).wasStarted;
            }

            public final boolean getWasStarted() {
                return this.wasStarted;
            }

            public int hashCode() {
                return Boolean.hashCode(this.wasStarted);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastCreated, reason: from getter */
            public boolean getIsAtLeastCreated() {
                return this.isAtLeastCreated;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastStarted, reason: from getter */
            public boolean getIsAtLeastStarted() {
                return this.isAtLeastStarted;
            }

            @Y61.k
            public String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("Created(wasStarted="), this.wasStarted, ')');
            }
        }

        /* compiled from: LifecycleStatus.kt */
        @P
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App$Started;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$App;", "()V", "isAtLeastCreated", "", "()Z", "isAtLeastStarted", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Started implements App {
            public static final int $stable = 0;

            @Y61.k
            public static final Started INSTANCE = new Started();
            private static final boolean isAtLeastCreated = true;
            private static final boolean isAtLeastStarted = true;

            private Started() {
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof Started);
            }

            public int hashCode() {
                return 1131216292;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastCreated */
            public boolean getIsAtLeastCreated() {
                return isAtLeastCreated;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastStarted */
            public boolean getIsAtLeastStarted() {
                return isAtLeastStarted;
            }

            @Y61.k
            public String toString() {
                return "Started";
            }
        }
    }

    /* compiled from: LifecycleStatus.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus;", "id", "", "getId", "()I", "Created", "CreatingError", "Nonexistent", "Started", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$Created;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$CreatingError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$Nonexistent;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$Started;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Components extends LifecycleStatus {

        /* compiled from: LifecycleStatus.kt */
        @P
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$Created;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "id", "", "(I)V", "getId", "()I", "isAtLeastCreated", "", "()Z", "isAtLeastStarted", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Created implements Components {
            public static final int $stable = 0;
            private final int id;
            private final boolean isAtLeastCreated = true;
            private final boolean isAtLeastStarted;

            public Created(int i12) {
                this.id = i12;
            }

            public static /* synthetic */ Created copy$default(Created created, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = created.id;
                }
                return created.copy(i12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @Y61.k
            public final Created copy(int id2) {
                return new Created(id2);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Created) && this.id == ((Created) other).id;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus.Components
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return Integer.hashCode(this.id);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastCreated, reason: from getter */
            public boolean getIsAtLeastCreated() {
                return this.isAtLeastCreated;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastStarted, reason: from getter */
            public boolean getIsAtLeastStarted() {
                return this.isAtLeastStarted;
            }

            @Y61.k
            public String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("Created(id="), this.id, ')');
            }
        }

        /* compiled from: LifecycleStatus.kt */
        @P
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\bHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$CreatingError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "id", "", "getId", "()I", "isAtLeastCreated", "", "()Z", "isAtLeastStarted", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CreatingError implements Components {
            public static final int $stable = 8;

            @Y61.l
            private final Throwable e;
            private final int id = -1;
            private final boolean isAtLeastCreated;
            private final boolean isAtLeastStarted;

            public CreatingError(@Y61.l Throwable th2) {
                this.e = th2;
            }

            public static /* synthetic */ CreatingError copy$default(CreatingError creatingError, Throwable th2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    th2 = creatingError.e;
                }
                return creatingError.copy(th2);
            }

            @Y61.l
            /* renamed from: component1, reason: from getter */
            public final Throwable getE() {
                return this.e;
            }

            @Y61.k
            public final CreatingError copy(@Y61.l Throwable e12) {
                return new CreatingError(e12);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreatingError) && L.f(this.e, ((CreatingError) other).e);
            }

            @Y61.l
            public final Throwable getE() {
                return this.e;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus.Components
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                Throwable th2 = this.e;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastCreated, reason: from getter */
            public boolean getIsAtLeastCreated() {
                return this.isAtLeastCreated;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastStarted, reason: from getter */
            public boolean getIsAtLeastStarted() {
                return this.isAtLeastStarted;
            }

            @Y61.k
            public String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("CreatingError(e="), this.e, ')');
            }
        }

        /* compiled from: LifecycleStatus.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$Nonexistent;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "()V", "id", "", "getId", "()I", "isAtLeastCreated", "", "()Z", "isAtLeastStarted", "equals", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Nonexistent implements Components {
            public static final int $stable = 0;

            @Y61.k
            public static final Nonexistent INSTANCE = new Nonexistent();
            private static final int id = -1;
            private static final boolean isAtLeastCreated = false;
            private static final boolean isAtLeastStarted = false;

            private Nonexistent() {
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof Nonexistent);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus.Components
            public int getId() {
                return id;
            }

            public int hashCode() {
                return 364392281;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastCreated */
            public boolean getIsAtLeastCreated() {
                return isAtLeastCreated;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastStarted */
            public boolean getIsAtLeastStarted() {
                return isAtLeastStarted;
            }

            @Y61.k
            public String toString() {
                return "Nonexistent";
            }
        }

        /* compiled from: LifecycleStatus.kt */
        @P
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components$Started;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$Components;", "id", "", "(I)V", "getId", "()I", "isAtLeastCreated", "", "()Z", "isAtLeastStarted", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Started implements Components {
            public static final int $stable = 0;
            private final int id;
            private final boolean isAtLeastCreated = true;
            private final boolean isAtLeastStarted = true;

            public Started(int i12) {
                this.id = i12;
            }

            public static /* synthetic */ Started copy$default(Started started, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = started.id;
                }
                return started.copy(i12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @Y61.k
            public final Started copy(int id2) {
                return new Started(id2);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Started) && this.id == ((Started) other).id;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus.Components
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return Integer.hashCode(this.id);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastCreated, reason: from getter */
            public boolean getIsAtLeastCreated() {
                return this.isAtLeastCreated;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus
            /* renamed from: isAtLeastStarted, reason: from getter */
            public boolean getIsAtLeastStarted() {
                return this.isAtLeastStarted;
            }

            @Y61.k
            public String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("Started(id="), this.id, ')');
            }
        }

        int getId();
    }

    /* compiled from: LifecycleStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/LifecycleStatus$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.LifecycleStatus$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f165517a = new Companion();
    }

    /* renamed from: isAtLeastCreated */
    boolean getIsAtLeastCreated();

    /* renamed from: isAtLeastStarted */
    boolean getIsAtLeastStarted();
}
