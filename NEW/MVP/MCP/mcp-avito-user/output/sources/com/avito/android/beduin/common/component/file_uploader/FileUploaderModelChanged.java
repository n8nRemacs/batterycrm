package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileUploaderModelChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileUploaderModelChanged;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FileUploaderModelChanged implements e.a<BeduinFileUploaderModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final FileUploaderModelChanged f101212c;

    /* renamed from: d, reason: collision with root package name */
    public static final FileUploaderModelChanged f101213d;

    /* renamed from: e, reason: collision with root package name */
    public static final FileUploaderModelChanged f101214e;

    /* renamed from: f, reason: collision with root package name */
    public static final FileUploaderModelChanged f101215f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ FileUploaderModelChanged[] f101216g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101217h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f101218b;

    /* compiled from: FileUploaderModelChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinFileUploaderModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101219l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinFileUploaderModel beduinFileUploaderModel) {
            return Boolean.valueOf(beduinFileUploaderModel.getButtonConfiguration().isEnabled());
        }
    }

    /* compiled from: FileUploaderModelChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinFileUploaderModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101220l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinFileUploaderModel beduinFileUploaderModel) {
            return beduinFileUploaderModel.getErrorMessage();
        }
    }

    /* compiled from: FileUploaderModelChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<BeduinFileUploaderModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f101221l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinFileUploaderModel beduinFileUploaderModel) {
            return beduinFileUploaderModel.getButtonConfiguration().getActions();
        }
    }

    /* compiled from: FileUploaderModelChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<BeduinFileUploaderModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f101222l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinFileUploaderModel beduinFileUploaderModel) {
            return beduinFileUploaderModel.getFiles();
        }
    }

    static {
        FileUploaderModelChanged fileUploaderModelChanged = new FileUploaderModelChanged(0, a.f101219l, "IsEnabled");
        f101212c = fileUploaderModelChanged;
        FileUploaderModelChanged fileUploaderModelChanged2 = new FileUploaderModelChanged(1, b.f101220l, "ErrorMessage");
        f101213d = fileUploaderModelChanged2;
        FileUploaderModelChanged fileUploaderModelChanged3 = new FileUploaderModelChanged(2, c.f101221l, "Actions");
        f101214e = fileUploaderModelChanged3;
        FileUploaderModelChanged fileUploaderModelChanged4 = new FileUploaderModelChanged(3, d.f101222l, "Files");
        f101215f = fileUploaderModelChanged4;
        FileUploaderModelChanged[] fileUploaderModelChangedArr = {fileUploaderModelChanged, fileUploaderModelChanged2, fileUploaderModelChanged3, fileUploaderModelChanged4};
        f101216g = fileUploaderModelChangedArr;
        f101217h = kotlin.enums.c.a(fileUploaderModelChangedArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileUploaderModelChanged(int i12, Y41.l lVar, String str) {
        this.f101218b = (N) lVar;
    }

    public static FileUploaderModelChanged valueOf(String str) {
        return (FileUploaderModelChanged) Enum.valueOf(FileUploaderModelChanged.class, str);
    }

    public static FileUploaderModelChanged[] values() {
        return (FileUploaderModelChanged[]) f101216g.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinFileUploaderModel beduinFileUploaderModel = (BeduinFileUploaderModel) beduinModel;
        ButtonConfiguration buttonConfiguration = beduinFileUploaderModel.getButtonConfiguration();
        Boolean bool = Boolean.FALSE;
        return BeduinFileUploaderModel.copy$default(beduinFileUploaderModel, null, null, null, ButtonConfiguration.copy$default(buttonConfiguration, null, null, null, null, null, bool, null, 31, null), null, null, null, bool, null, 55, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.file_uploader.BeduinFileUploaderModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @Y61.k
    public final Y41.l<BeduinFileUploaderModel, Object> b() {
        return this.f101218b;
    }
}
