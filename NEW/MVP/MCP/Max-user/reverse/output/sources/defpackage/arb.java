package defpackage;

/* loaded from: classes2.dex */
public enum arb {
    APP_INIT("app_init"),
    OPEN_CHATS_ROOT_SPAN("open_chats_to_render"),
    OPEN_CHAT_ROOT_SPAN("open_chat_to_render"),
    OPEN_CALL_SCREEN_ROOT_SPAN("open_call_screen_to_render"),
    MAIN_SCREEN_INIT_TO_RENDER("main_screen_init_to_render"),
    FOLDERS_INIT_TO_RENDER("folders_init_to_render"),
    CHATS_INIT_TO_RENDER("chats_init_to_render"),
    CHAT_INIT_TO_RENDER("chat_init_to_render"),
    CALL_INIT("call_init"),
    INCOMING_CALL_PROCESSING_INIT("incoming_call_processing_init"),
    CALL_SCREEN_INIT_TO_RENDER("call_screen_init_to_render"),
    CALL_SCREEN_VIEW_CREATION("call_screen_on_create_view"),
    CALL_SCREEN_VIEW_CREATED("call_screen_on_view_created");

    public final String a;

    arb(String str) {
        this.a = str;
    }
}
